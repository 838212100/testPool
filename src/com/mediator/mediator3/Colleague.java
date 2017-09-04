package com.mediator.mediator3;

/**
 * 同事类中必须有中介者
 * @author Administrator
 *
 */
public class Colleague {
	
	protected Mediator mediator;
	public Colleague(Mediator _mediator){
		this.mediator = _mediator;
	}

}
