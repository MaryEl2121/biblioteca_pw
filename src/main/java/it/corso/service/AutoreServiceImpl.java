package it.corso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.corso.dao.AutoreDao;
import it.corso.model.Autore;

@Service
public class AutoreServiceImpl implements AutoreService {
	@Autowired
	private AutoreDao autoreDao;
	
	public List<Autore> getAutori() {
		return (List<Autore>) autoreDao.findAllByOrderByCognomeAsc();
	}

	@Override
	public Autore getAutore(int autoreId) {
		return autoreDao.findById(autoreId).get();
	}
}

