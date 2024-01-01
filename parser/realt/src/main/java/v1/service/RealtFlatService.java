package v1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v1.domain.Flat;
import v1.domain.flatDao.FlatDao;
import v1.domain.realtApiDTO.Rate;
import v1.repository.RealtRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RealtFlatService {
    RealtRepo realtRepo;

    public RealtFlatService(RealtRepo realtRepo) {
        this.realtRepo = realtRepo;
    }

    @Transactional
    public FlatDao saveOrUpdate(Flat flat, String url) {
        List<Rate> rateList = flat.getNormalizedPriceHistory();
        Rate rate = rateList.get(0);
        Integer usd840 = null;
        Integer rub933 = null;
        if (Optional.ofNullable(rate.getPriceRates()).isPresent()) {
            usd840 = Math.toIntExact(Optional.ofNullable(rate.getPriceRates().get("840")).orElse(0L));
            rub933 = Math.toIntExact(Optional.ofNullable(rate.getPriceRates().get("933")).orElse(0L));
        }
        FlatDao flatDao = new FlatDao(
                flat.getCategory(), Optional.ofNullable(usd840).orElse(0), Optional.ofNullable(rub933).orElse(0), flat.getPaymentStatus(),
                flat.getRaiseDate(), flat.getCreatedAt(), flat.getUpdatedAt(), flat.getSeller(), flat.getStateRegionName(),
                flat.getStateDistrictName(), flat.getTownName(), flat.getTownDistrictName(),
                flat.getTownSubDistrictName(), flat.getStreetName(), Optional.ofNullable(flat.getHouseNumber()).orElse(0), url);
        return realtRepo.saveOrUpdarte(flatDao);
    }
}
