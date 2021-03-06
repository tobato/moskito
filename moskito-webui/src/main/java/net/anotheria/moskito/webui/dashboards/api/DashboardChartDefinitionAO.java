package net.anotheria.moskito.webui.dashboards.api;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 15.04.15 22:41
 */
@XmlRootElement(name="chart")
public class DashboardChartDefinitionAO implements Serializable{
	private String caption;
	private List<String> accumulatorNames = Collections.EMPTY_LIST;

	public List<String> getAccumulatorNames() {
		return accumulatorNames;
	}

	public void setAccumulatorNames(List<String> accumulatorNames) {
		this.accumulatorNames = accumulatorNames;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
