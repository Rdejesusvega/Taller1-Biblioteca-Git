package com.mycompany.taller1.biblioteca.git;

/**
 * Material
 * Parent class (superclass) that holds attributes common to
 * materials in the system. Book extends this class.
 */
public class Material {

    // Attributes
    protected String code;
    protected String title;
    protected String publicationYear;

    // Constructor
    public Material(String code, String title, String publicationYear) {
        this.code = code;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    // toString for easy printing/debugging
    @Override
    public String toString() {
        return "Material{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                '}';
    }
}