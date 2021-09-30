/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialjsf.web.form;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ptsb.tutorial.tutorialjsf.domain.Car;

/**
 * @author Nicholas
 */
@ManagedBean
@ViewScoped
public class CarForm {

    // ================================================================================
    // Instance variables
    // ================================================================================
    private Car car;
    private List<Car> cars;

    // ================================================================================
    // Methods
    // ================================================================================

    /**
     * This method will be trigger upon page view
     */
    @PostConstruct
    public void initForm() {
        // TODO: initialize necessary instance variable
    }

    /**
     * This method is to store cars to session.
     * 
     * @param cars
     */
    private void storeToSession(final List<Car> cars) {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        final ExternalContext externalContext = facesContext.getExternalContext();

        externalContext.getSessionMap().put("carList", cars);
    }

    /**
     * This method is to retreive back the cars from session.
     * 
     * @return cars
     */
    @SuppressWarnings("unchecked")
    private List<Car> getFromSession() {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        final ExternalContext externalContext = facesContext.getExternalContext();

        return (List<Car>) externalContext.getSessionMap().get("carList");
    }

    // ================================================================================
    // Getters and Setters
    // ================================================================================
    public Car getCar() {
        return car;
    }

    public void setCar(final Car car) {
        this.car = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(final List<Car> cars) {
        this.cars = cars;
    }

}
