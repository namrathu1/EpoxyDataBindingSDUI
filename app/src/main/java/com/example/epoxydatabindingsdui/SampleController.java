package com.example.epoxydatabindingsdui;

import android.widget.Toast;

import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.Typed2EpoxyController;

import java.util.List;

public class SampleController extends Typed2EpoxyController<List<SampleModel>, Boolean> {

    @AutoModel
    ContentBindingModel_ contentBindingModel_;

    @AutoModel
    FooterBindingModel_ footerBindingModel_;

    @AutoModel
    HeaderBindingModel_ headerBindingModel_;

    @Override
    protected void buildModels(List<SampleModel> sampleModelList, Boolean data2) {
        for (SampleModel sampleModel : sampleModelList) {
            if (sampleModel.type.equals("Header")) {
                headerBindingModel_.id(sampleModel.id).headerName(sampleModel.content);


            } else if (sampleModel.type.equals("Content")) {
                contentBindingModel_.id(sampleModel.id).sampleModelVariable(sampleModel).onClickContent(v -> Toast.makeText(v.getContext(),
                        sampleModel.content, Toast.LENGTH_SHORT)
                        .show());

            } else if (sampleModel.type.equals("Footer")) {
                footerBindingModel_.id(sampleModel.id).footerName(sampleModel.content);

            }
        }

    }
}
