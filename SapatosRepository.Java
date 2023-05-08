import java.util.List;

@Repository
public interface SapatosRepository {
    List<Sapatos> findAll();
    Sapatos findById(Long id);
    void save(Sapatos sapato);
    void update(Sapatos sapato);
    void delete(Long id);
