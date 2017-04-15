package com.github.bkhezry.extramapview.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionViewBuilder {
    private LatLng centerLatLng;
    private float mapsZoom = 14;
    private boolean forceCenterMap = false;
    private List<ExtraMarker> markers = new ArrayList<>();
    private List<LatLng[]> polygons = new ArrayList<>();
    private List<LatLng[]> polylines = new ArrayList<>();

    public OptionViewBuilder withCenterCoordinates(LatLng centerLatLng) {
        this.centerLatLng = centerLatLng;
        return this;

    }

    public OptionViewBuilder withMapsZoom(float mapsZoom) {
        this.mapsZoom = mapsZoom;
        return this;
    }

    public OptionViewBuilder withMarkers(List<ExtraMarker> markers) {
        this.markers = markers;
        return this;
    }

    public OptionViewBuilder withMarkers(ExtraMarker... markers) {
        this.markers.addAll(Arrays.asList(markers));
        return this;
    }

    public OptionViewBuilder withPolygons(LatLng[]... polygons) {
        this.polygons.addAll(Arrays.asList(polygons));
        return this;
    }


    public OptionViewBuilder withPolylines(LatLng[]... polylines) {
        this.polylines.addAll(Arrays.asList(polylines));
        return this;
    }

    public OptionViewBuilder withForceCenterMap(boolean withForceCenterMap) {
        this.forceCenterMap = withForceCenterMap;
        return this;
    }

    public OptionView build() {
        return new OptionView(centerLatLng, forceCenterMap, mapsZoom, markers, polygons, polylines);
    }


}