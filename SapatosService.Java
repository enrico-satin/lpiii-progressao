import java.util.List;

public interface SapatosService {
    List<Sapatos> findAll();
    Sapatos findById(Long id);
    void save(Sapatos sapato);
    void update(Sapatos sapato);
    void delete(Long id);
}
