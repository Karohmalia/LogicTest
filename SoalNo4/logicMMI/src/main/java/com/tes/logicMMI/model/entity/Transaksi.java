package com.tes.logicMMI.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    @Column(name = "kode")
    private String kode;

    @Column (name = "tanggal")
    private Date tanggal;
    
    @ManyToOne
    @JoinColumn (name = "kode_pelanggan")
    private Pelanggan kode_pelanggan;

    @ManyToOne
    @JoinColumn (name = "kode_barang")
    private Barang kode_barang;

    @Column (name = "jumlah_barang")
    private String jumlah_barang;
}
