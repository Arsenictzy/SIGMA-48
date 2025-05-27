package com.sigma48.model;

public class User {
    public enum Role {
        ADMIN,
        SUPERVISOR,
        AGEN
    }

    public enum TingkatAkses {
        RENDAH,
        RAHASIA,
        SANGAT_RAHASIA,
        TOP_SECRET
    }

    private String username;
    private String password;
    private Role role;
    private String namaLengkap;
    private boolean aktif;
    private TingkatAkses clearanceLevel;

    // Constructor
    public User() {
    }

    public User(String username, String password, Role role, String namaLengkap, boolean aktif) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.namaLengkap = namaLengkap;
        this.aktif = aktif;
    }
  
    // Getter dan Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public TingkatAkses getClearanceLevel() {
        return  clearanceLevel;
    }

    public void setClearanceLevel(TingkatAkses clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }
  
    // Helper
    public boolean isAdmin() {
        return role == Role.ADMIN;
    }

    public boolean isSupervisor() {
        return role == Role.SUPERVISOR;
    }

    public boolean isAgen() {
        return role == Role.AGEN;
    }
}
