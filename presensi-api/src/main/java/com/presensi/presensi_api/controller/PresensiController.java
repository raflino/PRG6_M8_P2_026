package com.presensi.presensi_api.controller;

import com.presensi.presensi_api.GeoService;
import com.presensi.presensi_api.entity.Presensi;
import com.presensi.presensi_api.repository.PresensiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/presensi")
@CrossOrigin(origins = "*")
public class PresensiController {

    @Autowired
    private PresensiRepository presensiRepository;

    @Autowired
    private GeoService geoService;

    @PostMapping
    public Presensi savePresensi(@RequestBody Presensi presensi) {
        return presensiRepository.save(presensi);
    }

    @PostMapping("/locate")
    public String checkLocation(@RequestBody Map<String, Object> request) {
        double lat = Double.parseDouble(request.get("lat").toString());
        double lng = Double.parseDouble(request.get("lng").toString());

        boolean inside = geoService.isInside(lat, lng);
        return inside ? "IN AREA" : "OUT AREA";
    }
}