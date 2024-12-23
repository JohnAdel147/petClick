package com.company.petclinic.view.owner;

import com.company.petclinic.entity.Owner;
import com.company.petclinic.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "owners/:id", layout = MainView.class)
@ViewController("Owner.detail")
@ViewDescriptor("owner-detail-view.xml")
@EditedEntityContainer("ownerDc")
public class OwnerDetailView extends StandardDetailView<Owner> {
}