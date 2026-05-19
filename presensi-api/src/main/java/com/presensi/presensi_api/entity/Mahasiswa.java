package com.presensi.presensi_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {

    @Id
    @Column(name = "nim_mhs", length = 20)
    private String nimMhs;

    @Column(name = "nama_mhs", length = 100)
    private String namaMhs;

    @Column(name = "foto_mhs", columnDefinition = "TEXT")  
    private String fotoMhs; 

    public Mahasiswa() {}
    public String getNimMhs() { return nimMhs; }
    public void setNimMhs(String nimMhs) { this.nimMhs = nimMhs; }

    public String getNamaMhs() { return namaMhs; }
    public void setNamaMhs(String namaMhs) { this.namaMhs = namaMhs; }

    public String getFotoMhs() { return fotoMhs; }
    public void setFotoMhs(String fotoMhs) { this.fotoMhs = fotoMhs; }
}