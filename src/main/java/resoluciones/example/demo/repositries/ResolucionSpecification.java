package resoluciones.example.demo.repositries;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import resoluciones.example.demo.dto.ResolucionFilterDTO;
import resoluciones.example.demo.entities.Resolucion;

import javax.persistence.criteria.Predicate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Component
public class ResolucionSpecification {


        public Specification<Resolucion> getByFilters(ResolucionFilterDTO ifd){
            return (root, query, criteriaBuilder) -> {
                List<Predicate> predicates = new ArrayList<>();

                if (ifd.getNomina()!=null ) {
                    if (StringUtils.hasLength(ifd.getNomina())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("nomina")),
                                        "%" + ifd.getNomina().toLowerCase() + "%"
                                )
                        );

                    }
                }
                if (ifd.getTipoDeAgrupamiento()!=null) {
                    if (StringUtils.hasLength(ifd.getTipoDeAgrupamiento())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("tipoDeAgrupamiento")),
                                        "%" + ifd.getTipoDeAgrupamiento().toLowerCase() + "%"
                                )
                        );

                    }
                }
                if (ifd.getTipodeGestion()!=null) {
                    if (StringUtils.hasLength(ifd.getTipodeGestion())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("tipodeGestion")),
                                        "%" + ifd.getTipodeGestion().toLowerCase() + "%"
                                )
                        );

                    }
                }
                if (ifd.getDenomiCertificacion()!=null) {
                    if (StringUtils.hasLength(ifd.getDenomiCertificacion())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("denomiCertificacion")),
                                        "%" + ifd.getDenomiCertificacion().toLowerCase() + "%"
                                )
                        );

                    }
                }

                if (ifd.getMarcoDeReferencia()!=null) {
                    if (StringUtils.hasLength(ifd.getMarcoDeReferencia())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("marcoDeReferencia")),
                                        "%" + ifd.getMarcoDeReferencia().toLowerCase() + "%"
                                )
                        );

                    }
                }
                if (ifd.getInstituciones()!=null) {
                    if (StringUtils.hasLength(ifd.getInstituciones())){
                        predicates.add(
                                criteriaBuilder.like(
                                        criteriaBuilder.lower(root.get("instituciones")),
                                        "%" + ifd.getInstituciones().toLowerCase() + "%"
                                )
                        );

                    }
                }




                query.distinct(true);


                String order = "fechaVencimientoUPlazoDeVigenciaCABA";

                query.orderBy(
                        ifd.isASC()?
                                criteriaBuilder.asc(root.get(order)) :
                                criteriaBuilder.desc(root.get(order))
                );

                return criteriaBuilder.or(predicates.toArray(new Predicate[0]));

            };
        }
    }

