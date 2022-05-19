package com.tes.logicMMI.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    @Id
    @Column (name = "kode")
    private String kode;

    @Column (name = "nama")
    private String nama;

    @Column (name = "alamat")
    private String alamat;
}
