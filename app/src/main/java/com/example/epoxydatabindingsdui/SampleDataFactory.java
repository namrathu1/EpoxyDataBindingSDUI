package com.example.epoxydatabindingsdui;

import java.util.ArrayList;
import java.util.List;

public class SampleDataFactory {
    static List<SampleModel> sampleModelList = new ArrayList<SampleModel>();

    public static List<SampleModel> getSampleData() {

            sampleModelList.add(new SampleModel(1, "Header", "Category 1"));
            sampleModelList.add(new SampleModel(11, "Content", "Hello World"));
            sampleModelList.add(new SampleModel(12, "Content", "Lorem-Ipsum"));
            sampleModelList.add(new SampleModel(13, "Content", "Hello Android"));
            sampleModelList.add(new SampleModel(2, "Header", "Category 2"));
            sampleModelList.add(new SampleModel(21, "Content", "Hello World"));
            sampleModelList.add(new SampleModel(22, "Content", "Lorem-Ipsum"));
            sampleModelList.add(new SampleModel(23, "Content", "Hello Android"));
            sampleModelList.add(new SampleModel(3, "Header", "Category 3"));
            sampleModelList.add(new SampleModel(31, "Content", "Hello World"));
            sampleModelList.add(new SampleModel(32, "Content", "Lorem-Ipsum"));
            sampleModelList.add(new SampleModel(33, "Content", "Hello Android"));
            sampleModelList.add(new SampleModel(4, "Header", "Category 4"));
            sampleModelList.add(new SampleModel(41, "Content", "Hello World"));
            sampleModelList.add(new SampleModel(42, "Content", "Lorem-Ipsum"));
            sampleModelList.add(new SampleModel(43, "Content", "Hello Android"));
            sampleModelList.add(new SampleModel(5, "Footer", "End of list"));
            return sampleModelList;

    }
}
