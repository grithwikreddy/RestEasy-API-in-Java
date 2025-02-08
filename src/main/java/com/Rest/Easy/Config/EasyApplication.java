package com.Rest.Easy.Config;


import org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap;
import org.jboss.resteasy.spi.*;
import org.jboss.resteasy.spi.interception.JaxrsInterceptorRegistry;
import org.jboss.resteasy.spi.metadata.ResourceBuilder;
import org.jboss.resteasy.spi.statistics.StatisticsController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.client.RxInvoker;
import javax.ws.rs.client.RxInvokerProvider;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ApplicationPath("/api")
public class EasyApplication extends Application {
    public EasyApplication() {
        // Bootstrap Resteasy
        ResteasyProviderFactory.setInstance(new ResteasyProviderFactory() {
            @Override
            public String toHeaderString(Object o) {
                return "";
            }

            @Override
            public UriBuilder createUriBuilder() {
                return null;
            }

            @Override
            public Response.ResponseBuilder createResponseBuilder() {
                return null;
            }

            @Override
            public Variant.VariantListBuilder createVariantListBuilder() {
                return null;
            }

            @Override
            public <T> T createEndpoint(Application application, Class<T> aClass) throws IllegalArgumentException, UnsupportedOperationException {
                return null;
            }

            @Override
            public <T> HeaderDelegate<T> createHeaderDelegate(Class<T> aClass) throws IllegalArgumentException {
                return null;
            }

            @Override
            public Link.Builder createLinkBuilder() {
                return null;
            }

            @Override
            public <T> MessageBodyReader<T> getMessageBodyReader(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public <T> MessageBodyWriter<T> getMessageBodyWriter(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public <T extends Throwable> ExceptionMapper<T> getExceptionMapper(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> ContextResolver<T> getContextResolver(Class<T> aClass, MediaType mediaType) {
                return null;
            }

            @Override
            public RuntimeType getRuntimeType() {
                return null;
            }

            @Override
            public Map<String, Object> getProperties() {
                return Map.of();
            }

            @Override
            public Object getProperty(String s) {
                return null;
            }

            @Override
            public Collection<String> getPropertyNames() {
                return List.of();
            }

            @Override
            public boolean isEnabled(Feature feature) {
                return false;
            }

            @Override
            public boolean isEnabled(Class<? extends Feature> aClass) {
                return false;
            }

            @Override
            public boolean isRegistered(Object o) {
                return false;
            }

            @Override
            public boolean isRegistered(Class<?> aClass) {
                return false;
            }

            @Override
            public Map<Class<?>, Integer> getContracts(Class<?> aClass) {
                return Map.of();
            }

            @Override
            public Set<Class<?>> getClasses() {
                return Set.of();
            }

            @Override
            public Set<Object> getInstances() {
                return Set.of();
            }

            @Override
            public Configuration getConfiguration() {
                return null;
            }

            @Override
            public ResteasyProviderFactory property(String s, Object o) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Class<?> aClass) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Class<?> aClass, int i) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Class<?> aClass, Class<?>... classes) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Class<?> aClass, Map<Class<?>, Integer> map) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Object o) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Object o, int i) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Object o, Class<?>... classes) {
                return null;
            }

            @Override
            public ResteasyProviderFactory register(Object o, Map<Class<?>, Integer> map) {
                return null;
            }

            @Override
            public Set<DynamicFeature> getServerDynamicFeatures() {
                return Set.of();
            }

            @Override
            public Set<DynamicFeature> getClientDynamicFeatures() {
                return Set.of();
            }

            @Override
            public Map<Class<?>, AsyncResponseProvider> getAsyncResponseProviders() {
                return Map.of();
            }

            @Override
            public Map<Class<?>, AsyncClientResponseProvider> getAsyncClientResponseProviders() {
                return Map.of();
            }

            @Override
            public Map<Class<?>, AsyncStreamProvider> getAsyncStreamProviders() {
                return Map.of();
            }

            @Override
            public Map<Type, ContextInjector> getContextInjectors() {
                return Map.of();
            }

            @Override
            public Map<Type, ContextInjector> getAsyncContextInjectors() {
                return Map.of();
            }

            @Override
            public Set<Class<?>> getProviderClasses() {
                return Set.of();
            }

            @Override
            public Set<Object> getProviderInstances() {
                return Set.of();
            }

            @Override
            public <T> T getContextData(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> T getContextData(Class<T> aClass, Type type, Annotation[] annotations, boolean b) {
                return null;
            }

            @Override
            protected void registerBuiltin() {

            }

            @Override
            public boolean isRegisterBuiltins() {
                return false;
            }

            @Override
            public void setRegisterBuiltins(boolean b) {

            }

            @Override
            public InjectorFactory getInjectorFactory() {
                return null;
            }

            @Override
            public void setInjectorFactory(InjectorFactory injectorFactory) {

            }

            @Override
            public JaxrsInterceptorRegistry<ReaderInterceptor> getServerReaderInterceptorRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<WriterInterceptor> getServerWriterInterceptorRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<ContainerRequestFilter> getContainerRequestFilterRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<ContainerResponseFilter> getContainerResponseFilterRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<ReaderInterceptor> getClientReaderInterceptorRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<WriterInterceptor> getClientWriterInterceptorRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<ClientRequestFilter> getClientRequestFilterRegistry() {
                return null;
            }

            @Override
            public JaxrsInterceptorRegistry<ClientResponseFilter> getClientResponseFilters() {
                return null;
            }

            @Override
            public boolean isBuiltinsRegistered() {
                return false;
            }

            @Override
            public void setBuiltinsRegistered(boolean b) {

            }

            @Override
            public void addHeaderDelegate(Class aClass, HeaderDelegate headerDelegate) {

            }

            @Override
            public <T> MessageBodyReader<T> getServerMessageBodyReader(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public <T> MessageBodyReader<T> getClientMessageBodyReader(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public List<ContextResolver> getContextResolvers(Class<?> aClass, MediaType mediaType) {
                return List.of();
            }

            @Override
            public ParamConverter getParamConverter(Class aClass, Type type, Annotation[] annotations) {
                return null;
            }

            @Override
            public <T> StringParameterUnmarshaller<T> createStringParameterUnmarshaller(Class<T> aClass) {
                return null;
            }

            @Override
            public void registerProvider(Class aClass) {

            }

            @Override
            public String toString(Object o, Class aClass, Type type, Annotation[] annotations) {
                return "";
            }

            @Override
            public HeaderDelegate getHeaderDelegate(Class<?> aClass) {
                return null;
            }

            @Override
            public void registerProvider(Class aClass, boolean b) {

            }

            @Override
            public void registerProvider(Class aClass, Integer integer, boolean b, Map<Class<?>, Integer> map) {

            }

            @Override
            public void registerProviderInstance(Object o) {

            }

            @Override
            public void registerProviderInstance(Object o, Map<Class<?>, Integer> map, Integer integer, boolean b) {

            }

            @Override
            public <T> AsyncResponseProvider<T> getAsyncResponseProvider(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> AsyncClientResponseProvider<T> getAsyncClientResponseProvider(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> AsyncStreamProvider<T> getAsyncStreamProvider(Class<T> aClass) {
                return null;
            }

            @Override
            public MediaType getConcreteMediaTypeFromMessageBodyWriters(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public Map<MessageBodyWriter<?>, Class<?>> getPossibleMessageBodyWritersMap(Class aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return Map.of();
            }

            @Override
            public <T> MessageBodyWriter<T> getServerMessageBodyWriter(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public <T> MessageBodyWriter<T> getClientMessageBodyWriter(Class<T> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
                return null;
            }

            @Override
            public <T> T createProviderInstance(Class<? extends T> aClass) {
                return null;
            }

            @Override
            public <T> T injectedInstance(Class<? extends T> aClass) {
                return null;
            }

            @Override
            public <T> T injectedInstance(Class<? extends T> aClass, HttpRequest httpRequest, HttpResponse httpResponse) {
                return null;
            }

            @Override
            public void injectProperties(Object o) {

            }

            @Override
            public void injectProperties(Object o, HttpRequest httpRequest, HttpResponse httpResponse) {

            }

            @Override
            public Map<String, Object> getMutableProperties() {
                return Map.of();
            }

            @Override
            public ResteasyProviderFactory setProperties(Map<String, Object> map) {
                return null;
            }

            @Override
            public Collection<Feature> getEnabledFeatures() {
                return List.of();
            }

            @Override
            public <I extends RxInvoker> RxInvokerProvider<I> getRxInvokerProvider(Class<I> aClass) {
                return null;
            }

            @Override
            public RxInvokerProvider<?> getRxInvokerProviderFromReactiveClass(Class<?> aClass) {
                return null;
            }

            @Override
            public boolean isReactive(Class<?> aClass) {
                return false;
            }

            @Override
            public ResourceBuilder getResourceBuilder() {
                return null;
            }

            @Override
            public void initializeClientProviders(ResteasyProviderFactory resteasyProviderFactory) {

            }

            @Override
            public StatisticsController getStatisticsController() {
                return null;
            }

            @Override
            protected boolean isOnServer() {
                return false;
            }
        });
       // ResteasyBootstrap.init();
    }
}
