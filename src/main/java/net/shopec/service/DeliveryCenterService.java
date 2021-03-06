package net.shopec.service;

import java.util.List;

import net.shopec.Page;
import net.shopec.Pageable;
import net.shopec.entity.DeliveryCenter;
import net.shopec.entity.Store;

/**
 * Service - 发货点
 * 
 */
public interface DeliveryCenterService extends BaseService<DeliveryCenter> {

	/**
	 * 查找默认发货点
	 * 
	 * @param store
	 *            店铺
	 * @return 默认发货点，若不存在则返回null
	 */
	DeliveryCenter findDefault(Store store);

	/**
	 * 查找发货点分页
	 * 
	 * @param store
	 *            店铺
	 * @param pageable
	 *            分页
	 * @return 发货点分页
	 */
	Page<DeliveryCenter> findPage(Store store, Pageable pageable);

	/**
	 * 查找发货点
	 * 
	 * @param store
	 *            店铺
	 * @return 发货点
	 */
	List<DeliveryCenter> findAll(Store store);

}