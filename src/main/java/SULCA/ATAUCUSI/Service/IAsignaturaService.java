package SULCA.ATAUCUSI.Service;

import SULCA.ATAUCUSI.Entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> listaAsignaturas();

    Asignatura obtenerPorDenominacionOrSigla(String denoSig);

    Asignatura guardarAsignatura(Asignatura asignatura);
}
