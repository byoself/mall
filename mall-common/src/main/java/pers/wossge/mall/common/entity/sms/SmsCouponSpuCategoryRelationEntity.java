package pers.wossge.mall.common.entity.sms;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 优惠券分类关联
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-20 00:21:33
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class SmsCouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠券id
	 */
	private Long couponId;
	/**
	 * 产品分类id
	 */
	private Long categoryId;
	/**
	 * 产品分类名称
	 */
	private String categoryName;

}
