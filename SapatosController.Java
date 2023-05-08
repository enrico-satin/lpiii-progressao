@RestController
@RequestMapping("/api/sapatos")
public class SapatosController {
    @Autowired
    private SapatosService sapatosService;
    
    @GetMapping
    public List<Sapatos> getAllSapatos() {
        return sapatosService.getAllSapatos();
    }
    
    @GetMapping("/{id}")
    public Sapatos getSapato(@PathVariable Long id) {
        return sapatosService.getSapato(id);
    }
    
    @PostMapping
    public Sapatos createSapato(@RequestBody Sapatos sapato) {
        return sapatosService.createSapato(sapato);
    }
    
    @PutMapping("/{id}")
    public Sapatos modifySapato(@PathVariable Long id, @RequestBody Sapatos sapato) {
        return sapatosService.modifySapato(id, sapato);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSapato(@PathVariable Long id) {
        sapatosService.deleteSapato(id);
        return ResponseEntity.ok().build();
    }
}
