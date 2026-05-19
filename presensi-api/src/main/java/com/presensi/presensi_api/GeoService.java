package com.presensi.presensi_api;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.springframework.stereotype.Service;

@Service
public class GeoService {
    
    private final Polygon area;
    
    public GeoService() {
        GeometryFactory factory = new GeometryFactory();
        
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(106.827, -6.175),
            new Coordinate(106.830, -6.175),
            new Coordinate(106.830, -6.180),
            new Coordinate(106.827, -6.180),
            new Coordinate(106.827, -6.175)
        };
        
        area = factory.createPolygon(coordinates);
    }
    
    public boolean isInside(double latitude, double longitude) {
        GeometryFactory factory = new GeometryFactory();
        Point point = factory.createPoint(new Coordinate(longitude, latitude));
        return area.contains(point);
    }
}