package com.company.petclinic.view.vet;

import com.company.petclinic.entity.Vet;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "vets/:id", layout = MainView.class)
@ViewController("Vet.detail")
@ViewDescriptor("vet-detail-view.xml")
@EditedEntityContainer("vetDc")
public class VetDetailView extends StandardDetailView<Vet> {
}