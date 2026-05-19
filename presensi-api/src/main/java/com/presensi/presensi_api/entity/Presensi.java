package com.presensi.presensi_api.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "presensi")
public class Presensi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nim_mhs")
    private String nimMhs;
    
    @Column(name = "kode_mk")
    private String kodeMk;
    
    @Column(name = "pertemuan_ke")
    private Integer pertemuanKe;
    
    private LocalDate tanggal;
    
    @Column(name = "jam_presensi")
    private LocalTime jamPresensi;
    
    private String status;
    private String ruangan;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNimMhs() { return nimMhs; }
    public void setNimMhs(String nimMhs) { this.nimMhs = nimMhs; }
    public String getKodeMk() { return kodeMk; }
    public void setKodeMk(String kodeMk) { this.kodeMk = kodeMk; }
    public Integer getPertemuanKe() { return pertemuanKe; }
    public void setPertemuanKe(Integer pertemuanKe) { this.pertemuanKe = pertemuanKe; }
    public LocalDate getTanggal() { return tanggal; }
    public void setTanggal(LocalDate tanggal) { this.tanggal = tanggal; }
    public LocalTime getJamPresensi() { return jamPresensi; }
    public void setJamPresensi(LocalTime jamPresensi) { this.jamPresensi = jamPresensi; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getRuangan() { return ruangan; }
    public void setRuangan(String ruangan) { this.ruangan = ruangan; }
}