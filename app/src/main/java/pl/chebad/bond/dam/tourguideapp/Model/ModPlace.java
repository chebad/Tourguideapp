package pl.chebad.bond.dam.tourguideapp.Model;

/**
 * Created by Damian Bondaruk on 2017-05-31.
 */

public class ModPlace {
    private final int PICTURE_PROVIDED = -1;
    private String simpleInformation;
    private String explication;
    private int pictureID = PICTURE_PROVIDED;

    /**
     * Basic constructor with two parameters.
     *
     * @param simpleInformation Simple info about place.
     * @param explication       More information about attraction or place, e.g. history.
     */
    public ModPlace(String simpleInformation, String explication) {
        this.simpleInformation = simpleInformation;
        this.explication = explication;
    }

    /**
     * Constructor with three parameters.
     *
     * @param simpleInformation Simple info about place.
     * @param explication       More information about attraction or place, e.g. history.
     * @param pictureID         Picture which describe this place. Id from resources files.
     */
    public ModPlace(String simpleInformation, String explication, int pictureID) {
        this.simpleInformation = simpleInformation;
        this.explication = explication;
        this.pictureID = pictureID;
    }

    //Check if there is any picture to display.
    public boolean hasImage() {
        return pictureID != PICTURE_PROVIDED;
    }

    // Getters for private fields.
    public String getSimpleInformation() {
        return simpleInformation;
    }

    public String getExplication() {
        return explication;
    }

    public int getPictureID() {
        return pictureID;
    }
    // End of getters.
}
