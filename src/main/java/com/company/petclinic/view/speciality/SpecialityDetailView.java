package com.company.petclinic.view.speciality;

import com.company.petclinic.entity.Speciality;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "specialities/:id", layout = MainView.class)
@ViewController("Speciality.detail")
@ViewDescriptor("speciality-detail-view.xml")
@EditedEntityContainer("specialityDc")
public class SpecialityDetailView extends StandardDetailView<Speciality> {
}