package com.company.petclinic.view.pettype;

import com.company.petclinic.entity.PetType;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "petTypes/:id", layout = MainView.class)
@ViewController("PetType.detail")
@ViewDescriptor("pet-type-detail-view.xml")
@EditedEntityContainer("petTypeDc")
public class PetTypeDetailView extends StandardDetailView<PetType> {
}