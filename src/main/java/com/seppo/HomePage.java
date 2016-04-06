package com.seppo;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Link("forward"){
			 @Override
			 public void onClick() {
			 //link code goes here
			 }
			 });
		
		
		/*AjaxButton forward = new AjaxButton("forward"){ 

			private static final long serialVersionUID = 1L;

			public void onClick(AjaxRequestTarget target ){ 
			     
				   Car.getInstance().forward();
				   
			   } 
		}; 
				
		add(forward); */
		
    }
}


