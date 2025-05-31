
import com.bernardo.games_api.model.Score;
import com.bernardo.games_api.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping
    public Score salvar(@RequestBody Score score) {
        return scoreService.salvar(score);
    }

    @GetMapping
    public List<Score> listarTodos() {
        return scoreService.listarTodos();
    }

    @GetMapping("/{id}")
    public Score buscarPorId(@PathVariable int id) {
        return scoreService.buscarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Score atualizar(@PathVariable int id, @RequestBody Score scoreAtualizado) {
        return scoreService.atualizar(id, scoreAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        scoreService.deletar(id);
    }
}
