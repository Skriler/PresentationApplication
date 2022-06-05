package edu.itstep.presentationapplication.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import edu.itstep.presentationapplication.R;
import edu.itstep.presentationapplication.adapters.GalleryPagerAdapter;
import edu.itstep.presentationapplication.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ViewPager2 viewPagerGallery = binding.viewPagerGallery;
        GalleryPagerAdapter pageAdapter = new GalleryPagerAdapter(
                this.getActivity(),
                galleryViewModel.getSeasons()
        );
        viewPagerGallery.setAdapter(pageAdapter);

        TabLayout tabLayout = binding.tabLayout;
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPagerGallery,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(galleryViewModel.getSeason(position).getTitle());
                    }
                });
        tabLayoutMediator.attach();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}