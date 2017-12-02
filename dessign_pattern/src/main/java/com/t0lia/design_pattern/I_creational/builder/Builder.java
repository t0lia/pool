package com.t0lia.design_pattern.I_creational.builder;

import com.t0lia.design_pattern.I_creational.abstract_factory.AbstractCarFactory;
import com.t0lia.design_pattern.I_creational.factory_method.FactoryMethodI;

/**
 * <strong>Description</strong>
 * <p>
 * Шаблон строитель хороший выбор для проектирования классов, в которых статические методы генерации или конструкторы
 * имеют большое число параметров, в особенности если параметры необязательны. Код клиента намного проще читать и
 * писать с использованием Builder нежели чем традиционных конструкторов и Builder более безопасны чем JavaBean.
 * <p>
 * <pre class="code">
 *              _______________________________________________________
 *              |  JavaBeans  |  Telescoping constructor  |  Builder  |
 *              |-------------|---------------------------|-----------|
 * Not verbose  |      V      |             X             |     V     |
 * Safety       |      X      |             V             |     V     |
 *              ```````````````````````````````````````````````````````
 * </pre>
 *
 * <strong>Pros:</strong>
 * <ol>
 *      <li>Позволяет удобно конструировать объекты с множеством необязательных параметров (альтернатива массивным
 * конструкторам и javabean подходу), гибко управлять этими параметрами </li>
 *      <li>Позволяет отложить публикацию объекта, избежать неконсистентности, возможность создавать immutable реализации</li>
 *      <li>Могут использоваться для конструирования множества объектов</li>
 *      <li>Можно использовать vararg</li>
 *      <li>Можно автоматически устанавливать параметры (билдеры с предустановлеными параметрами, по сути, являются фабрикой)</li>
 *      <li>Билдер функциональный интерфейс. Его можно параметризовать с помощью generic
 * <pre class="code"><code class="java">
 * // A builder for objects of type Coffee
 * public interface CoffeeBuilder<T> implements Builder<Coffee> {
 *     public T build();
 * }
 * </code></pre>
 *      </li>
 * </ol>
 * <strong>Cons:</strong>
 * <ol>
 *      <li>Создание дополнительного объекта</li>
 *      <li>Нецелесообразно использовать с небольшим количеством параметров (<=4)</li>
 * </ol>
 * <p>
 * <strong>Example:</strong>
 * <pre class="code"><code class="java">
 * Coffee americano  = new Coffee.CoffeeBuilder(2).water(3).build();
 * </code></pre>
 * <p>
 * <strong>Books</strong>
 * <ul>
 *     <li>Effective Java, Joshua Bloch</li>
 *     <li>Design Pattern, GOF</li>
 * </ul>
 *
 * <string>Родственные шаблоны</string>
 * <ul>
 *     <li>{@link AbstractCarFactory}, {@link FactoryMethodI} - builder с преднастроенными
 *     параметрами. Используется для передачи в метод и последующего вызова build()</li>
 * </ul>
 * <strong>Implementation</strong>
 * <ul>
 *     <li>{@link Coffee.CoffeeBuilder}</li>
 * </ul>
 * <strong>Improvements</strong>
 * <p>
 * <strong>JDK examples:</strong>
 * <ul>
 *     <li>{@link StringBuilder}</li>
 *     <li>{@link StringBuffer}</li>
 * </ul>
 * <p>
 */
public interface Builder<T>{
    T build();
}
