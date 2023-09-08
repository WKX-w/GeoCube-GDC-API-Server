package whu.edu.cn.entity.modify;

import whu.edu.cn.entity.coverage.CollectionInfo;
import whu.edu.cn.entity.extent.Extent;
import whu.edu.cn.entity.extent.SpatialExtent;
import whu.edu.cn.entity.extent.TemporalExtent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModifyParam {
    private String collection;
    private String extent;
    private String startTime;
    private String endTime;
    private List<ModifyBands> bands;
    private List<ModifyDimension> dimensions;

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<ModifyBands> getBands() {
        return bands;
    }

    public void setBands(List<ModifyBands> bands) {
        this.bands = bands;
    }

    public List<ModifyDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<ModifyDimension> dimensions) {
        this.dimensions = dimensions;
    }
}