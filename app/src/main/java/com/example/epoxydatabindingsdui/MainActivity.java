package com.example.epoxydatabindingsdui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyRecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MainActivity extends AppCompatActivity implements EpoxyRecyclerView.ModelBuilderCallback {

    EpoxyRecyclerView epoxyRecyclerView;
    List<SampleModel> sampleModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epoxyRecyclerView = (EpoxyRecyclerView) findViewById(R.id.recyclerView);
        sampleModelList = SampleDataFactory.getSampleData();

        epoxyRecyclerView.buildModelsWith(this);

// Request a model build on the recyclerview when data changes
        epoxyRecyclerView.requestModelBuild();

    }

    @Override
    public void buildModels(@NotNull EpoxyController epoxyController) {
        for (SampleModel sampleModel : sampleModelList) {
            if (sampleModel.type.equals("Header")) {
                new HeaderBindingModel_().id(sampleModel.id).headerName(sampleModel.content).addTo(epoxyController);


            } else if (sampleModel.type.equals("Content")) {
                new ContentBindingModel_().id(sampleModel.id).sampleModelVariable(sampleModel).onClickContent(v -> Toast.makeText(v.getContext(),
                        sampleModel.content, Toast.LENGTH_SHORT)
                        .show()).addTo(epoxyController);

            } else if (sampleModel.type.equals("Footer")) {
                new FooterBindingModel_().id(sampleModel.id).footerName(sampleModel.content).addTo(epoxyController);

            }
        }
    }
}