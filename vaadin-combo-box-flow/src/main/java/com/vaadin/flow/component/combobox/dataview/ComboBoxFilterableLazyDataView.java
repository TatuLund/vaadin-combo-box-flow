package com.vaadin.flow.component.combobox.dataview;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.data.provider.AbstractFilterableLazyDataView;
import com.vaadin.flow.data.provider.DataCommunicator;
import com.vaadin.flow.data.provider.FilterCombiner;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.function.SerializableSupplier;

/**
 * Data view implementation for ComboBox with lazy data fetching. Provides
 * information on the data and allows operations on it.
 *
 * @param <T>
 *            the type of the items in ComboBox
 */
public class ComboBoxFilterableLazyDataView<T>
        extends AbstractFilterableLazyDataView<T, String> {

    /**
     * Creates a new instance of ComboBox lazy data view, verifies the passed
     * data provider is compatible with this data view implementation, and sets
     * a callbacks for handling the items filtering.
     *
     * @param dataCommunicator
     *            the data communicator of the ComboBox, not <code>null</code>
     * @param component
     *            the ComboBox component, not <code>null</code>
     * @param filterConsumer
     *            not used, because ComboBox does not support programmatically
     *            filter setting, can be <code>null</code>
     * @param filterSupplier
     *            not used, because ComboBox does not support programmatically
     *            filter setting, can be <code>null</code>
     */
    public ComboBoxFilterableLazyDataView(DataCommunicator<T> dataCommunicator,
            Component component, SerializableConsumer<String> filterConsumer,
            SerializableSupplier<String> filterSupplier) {
        super(dataCommunicator, component, (ignore) -> {}, () -> null);
    }

    /**
     * This method is not supported for the {@link ComboBox} component.
     * <p>
     * Always throws an {@link UnsupportedOperationException}.
     *
     * @param ignored
     *            filter to be ignored
     *
     * @throws UnsupportedOperationException
     *             throws always
     */
    @Override
    public void setFilter(String ignored) {
        throw new UnsupportedOperationException("Checkbox does not support "
                + "a programmatically filter setting and only supports a "
                + "string client-side filter.");
    }

    /**
     * This method is not supported for the {@link ComboBox} component.
     * <p>
     * Always throws an {@link UnsupportedOperationException}.
     *
     * @param ignored
     *            filter combiner to be ignored
     *
     * @throws UnsupportedOperationException
     *             throws always
     */
    @Override
    public void setFilterCombiner(FilterCombiner<String> ignored) {
        throw new UnsupportedOperationException("Checkbox does not support "
                + "a programmatically filter setting and only supports a "
                + "string client-side filter. Filter combiner is not "
                + "supported therefore.");
    }

    /**
     * This method is not supported for the {@link ComboBox} component.
     * <p>
     * Always throws an {@link UnsupportedOperationException}.
     *
     * @throws UnsupportedOperationException
     *             throws always
     */
    @Override
    public void removeFilter() {
        throw new UnsupportedOperationException("Checkbox does not support "
                + "a programmatically filter setting and only supports a "
                + "string client-side filter. Filter removal is "
                + "not supported therefore.");
    }
}
