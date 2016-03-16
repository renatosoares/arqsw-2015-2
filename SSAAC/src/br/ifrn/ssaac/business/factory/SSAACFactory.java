package br.ifrn.ssaac.business.factory;

import br.ifrn.ssaac.business.facade.SSAAC;
import br.ifrn.ssaac.business.facade.SSAACImp;
import br.ifrn.ssaac.business.userbi.UserBI;
import br.ifrn.ssaac.business.userbi.UserBIImp;

public class SSAACFactory {
	private static SSAAC facade = null;
	private static SSAACFactory instance = null;
	
	private SSAACFactory() {
		super();
	}
	
	public static SSAACFactory getInstance() {
		if (instance == null) {
			instance = new SSAACFactory();
		}
		return instance;
	}

	public SSAAC getFacade() {
		if (facade == null) {
			facade = new SSAACImp();
			((SSAACImp) facade).setUserBI(getUserIB());
		}
		return facade;
	}
	
	public UserBI getUserIB() {
		return new UserBIImp();
	}
}
