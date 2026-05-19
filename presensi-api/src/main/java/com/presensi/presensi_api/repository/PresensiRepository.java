package com.presensi.presensi_api.repository;

import com.presensi.presensi_api.entity.Presensi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresensiRepository extends JpaRepository<Presensi, Long> {
}