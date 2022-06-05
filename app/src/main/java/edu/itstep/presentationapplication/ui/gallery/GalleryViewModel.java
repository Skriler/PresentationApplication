package edu.itstep.presentationapplication.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import edu.itstep.presentationapplication.entities.Season;
import edu.itstep.presentationapplication.services.SeasonService;

public class GalleryViewModel extends ViewModel {
    private final ArrayList<Season> seasons;
    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
        seasons = SeasonService.getSeasonList();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public Season getSeason(int index) {
        return seasons.get(index);
    }
}