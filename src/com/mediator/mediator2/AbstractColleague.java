package com.mediator.mediator2;

/**
 * 抽象同事类
 * @author Administrator
 *
 */
public class AbstractColleague {
	
	protected AbstractMediator mdeiator;
	public AbstractColleague(AbstractMediator _mediator){
		this.mdeiator = _mediator;
	}

}
