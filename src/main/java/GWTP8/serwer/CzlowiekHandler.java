package GWTP8.serwer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

import GWTP8.shared.CzlowiekAction;
import GWTP8.shared.CzlowiekDto;
import GWTP8.shared.CzlowiekResult;

public class CzlowiekHandler implements ActionHandler<CzlowiekAction, CzlowiekResult> {

	@Override
	public CzlowiekResult execute(CzlowiekAction czlowiek, ExecutionContext arg1) throws ActionException {
		 CzlowiekResult result = null;
		 

		 new CzlowiekDao().createCzlowiek(czlowiek.getCzlowiek());
		 
		return result;
	}

	@Override
	public Class<CzlowiekAction> getActionType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void undo(CzlowiekAction arg0, CzlowiekResult arg1, ExecutionContext arg2) throws ActionException {
		// TODO Auto-generated method stub
		
	}
//	private CzlowiekDto createCzlowiekDto(Czlowiek czlowiek) {
//		return new CzlowiekDto(czlowiek.getId(), czlowiek.getImie(), czlowiek.getNazwisko(), czlowiek.getPesel(), czlowiek.getUlica(), czlowiek.getNrdomu(), czlowiek.getMiejscowosc());
//	}
}
