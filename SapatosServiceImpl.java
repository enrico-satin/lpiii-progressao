@Service
public class SapatosServiceImpl implements SapatosService {
    @Autowired
    private SapatosRepository sapatosRepository;

    @Override
    public List<Sapatos> findAll() {
        return sapatosRepository.findAll();
    }

    @Override
    public Sapatos findById(Long id) {
        return sapatosRepository.findById(id);
    }

    @Override
    public void save(Sapatos sapato) {
        sapatosRepository.save(sapato);
    }

    @Override
    public void update(Sapatos sapato) {
        sapatosRepository.update(sapato);
    }

    @Override
    public void delete(Long id) {
        sapatosRepository.delete(id);
    }
}
