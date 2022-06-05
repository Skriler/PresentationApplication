package edu.itstep.presentationapplication.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

import edu.itstep.presentationapplication.entities.Season;
import edu.itstep.presentationapplication.ui.page.SeasonPageFragment;

public class GalleryPagerAdapter extends FragmentStateAdapter {
    ArrayList<Season> seasons;

    public GalleryPagerAdapter(FragmentActivity fragmentActivity, ArrayList<Season> seasons) {
        super(fragmentActivity);
        this.seasons = seasons;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return SeasonPageFragment.newInstance(seasons.get(position));
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
