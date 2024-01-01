package v1.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import v1.domain.flatDao.FlatDao;

@Repository
public interface RealtRepo extends CrudRepository<FlatDao, Long> {

    @Query(value="insert into realt.flats (id, category, usd840, rub933, payment_status, raise_date, created_at, updated_at, seller, state_region_name, state_district_name, town_name, town_district_name, town_sub_district_name, street_name, house_number, url)"  +
            "values (nextval('flat.realt.generator'), :#{#flatDao.category}, :#{#flatDao.usd840}, :#{#flatDao.rub933}, :#{#flatDao.paymentStatus}, :#{#flatDao.raiseDate}, :#{#flatDao.createdAt}, :#{#flatDao.updatedAt}, :#{#flatDao.seller}, :#{#flatDao.stateRegionName}, :#{#flatDao.stateDistrictName}, :#{#flatDao.townName}, :#{#flatDao.townDistrictName}, :#{#flatDao.townSubDistrictName}, :#{#flatDao.streetName}, :#{#flatDao.houseNumber}, :#{#flatDao.url})" +
            "on conflict(url) do update set " +
            "category= coalesce(excluded.category, flats.category)," +
            "usd840= coalesce(excluded.usd840, flats.usd840)," +
            "rub933= coalesce(excluded.rub933, flats.rub933)," +
            "payment_status= coalesce(excluded.payment_status, flats.payment_status)," +
            "raise_date= coalesce(excluded.raise_date, flats.raise_date)," +
            "created_at= coalesce(excluded.created_at, flats.created_at)," +
            "updated_at= coalesce(excluded.updated_at, flats.updated_at)," +
            "seller= coalesce(excluded.seller, flats.seller)," +
            "state_region_name= coalesce(excluded.state_region_name, flats.state_region_name)," +
            "state_district_name= coalesce(excluded.state_district_name, flats.state_district_name)," +
            "town_name= coalesce(excluded.town_name, flats.town_name)," +
            "town_district_name= coalesce(excluded.town_district_name, flats.town_district_name)," +
            "town_sub_district_name= coalesce(excluded.town_sub_district_name, flats.town_sub_district_name)," +
            "street_name= coalesce(excluded.street_name, flats.street_name)," +
            "house_number= coalesce(excluded.house_number, flats.house_number)" +
            "returning *", nativeQuery = true)
    FlatDao saveOrUpdarte(FlatDao flatDao);
}
