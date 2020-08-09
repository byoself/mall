package pers.wossge.mall.common.entity.wms;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 仓库信息
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-20 00:21:53
 */
@Data
@TableName("wms_ware_info")
public class WmsWareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 仓库名
	 */
	private String name;
	/**
	 * 仓库地址
	 */
	private String address;
	/**
	 * 区域编码
	 */
	private String areacode;

}
