package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Brail Estreiou Com Vitoria Na Copa do Mundo","ashhashdahd"));
        news.add(new News("Brail Pega a França Na Proxima Sexta-Feira","hjadjadhjadha"));
        news.add(new News("Argeentina Estreia Com Vitoria ","askdjaskldjakld"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}