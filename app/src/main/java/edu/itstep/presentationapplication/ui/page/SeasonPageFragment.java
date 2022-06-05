package edu.itstep.presentationapplication.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import edu.itstep.presentationapplication.R;
import edu.itstep.presentationapplication.entities.Season;

public class SeasonPageFragment extends Fragment {
    private Season selectedSeason;

    public static SeasonPageFragment newInstance(Season season) {
        SeasonPageFragment fragment = new SeasonPageFragment();
        Bundle args = new Bundle();
        args.putSerializable("selectedSeason", season);
        fragment.setArguments(args);
        return fragment;
    }

    public SeasonPageFragment() {  }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
            selectedSeason = (Season) getArguments().getSerializable("selectedSeason");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_season_page, container, false);

        ImageView imgSeason = view.findViewById(R.id.imgSeason);
        TextView tvSeasonTitle = view.findViewById(R.id.tvSeasonTitle);
        TextView tvSeasonDescription = view.findViewById(R.id.tvSeasonDescription);

        imgSeason.setImageResource(selectedSeason.getImage());
        tvSeasonTitle.setText(selectedSeason.getTitle());
        tvSeasonDescription.setText(selectedSeason.getDescription());

        return view;
    }
}
