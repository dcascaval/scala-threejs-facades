package typings.three.three.renderers.webgl

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
sealed trait RenderTarget extends js.Object

@js.native
sealed trait RenderItem extends js.Object:
	val id: Double = js.native;
	val `object`: Object3D = js.native;
	val geometry: BufferGeometry | Null = js.native;
	val material: Material = js.native;
	val program: WebGLProgram = js.native;
	val groupOrder: Double = js.native;
	val renderOrder: Double = js.native;
	val z: Double = js.native;
	val group: Group | Null = js.native;

@js.native
@JSGlobal("THREE.WebGLRenderList")
class WebGLRenderList extends js.Object:
	def this(properties: WebGLProperties) = this()
	val opaque: js.Array[RenderItem] = js.native;
	val transparent: js.Array[RenderItem] = js.native;
	def init(): Unit = js.native
	def push(`object`: Object3D, geometry: BufferGeometry | Null, material: Material, groupOrder: Double, z: Double, group: Group | Null): Unit = js.native
	def unshift(`object`: Object3D, geometry: BufferGeometry | Null, material: Material, groupOrder: Double, z: Double, group: Group | Null): Unit = js.native
	def sort(opaqueSort: js.Function2[js.Any,js.Any,Double], transparentSort: js.Function2[js.Any,js.Any,Double]): Unit = js.native
	def finish(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLRenderLists")
class WebGLRenderLists extends js.Object:
	def this(properties: WebGLProperties) = this()
	def dispose(): Unit = js.native
	def get(scene: Scene, camera: Camera): WebGLRenderList = js.native

@js.native
@JSGlobal("THREE.WebGLShadowMap")
class WebGLShadowMap extends js.Object:
	def this(_renderer: WebGLRenderer, _objects: WebGLObjects, _capabilities: WebGLCapabilities) = this()
	val enabled: Boolean = js.native;
	val autoUpdate: Boolean = js.native;
	val needsUpdate: Boolean = js.native;
	val `type`: ShadowMapType = js.native;
	val cullFace: js.Any = js.native;
	def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLPrograms")
class WebGLPrograms extends js.Object:
	def this(renderer: WebGLRenderer, cubemaps: WebGLCubeMaps, extensions: WebGLExtensions, capabilities: WebGLCapabilities, bindingStates: WebGLBindingStates, clipping: WebGLClipping) = this()
	val programs: js.Array[WebGLProgram] = js.native;
	def getParameters(material: Material, lights: js.Any, shadows: js.Array[js.Object], scene: Scene, `object`: js.Any): js.Any = js.native
	def getProgramCacheKey(parameters: js.Any): String = js.native
	def getUniforms(material: Material): js.Object = js.native
	def acquireProgram(parameters: js.Any, cacheKey: String): WebGLProgram = js.native
	def releaseProgram(program: WebGLProgram): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLExtensions")
class WebGLExtensions extends js.Object:
	def this(gl: WebGLRenderingContext) = this()
	def has(name: String): Boolean = js.native
	def init(capabilities: WebGLCapabilities): Unit = js.native
	def get(name: String): js.Any = js.native

@js.native
@JSGlobal("THREE.WebGLInfo")
class WebGLInfo extends js.Object:
	def this(gl: WebGLRenderingContext) = this()
	val autoReset: Boolean = js.native;
	val memory: objectType60 = js.native;
	val programs: js.Array[WebGLProgram] | Null = js.native;
	val render: objectType61 = js.native;
	def update(count: Double, mode: Double, instanceCount: Double): Unit = js.native
	def reset(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLBufferRenderer")
class WebGLBufferRenderer extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: WebGLExtensions, info: WebGLInfo, capabilities: WebGLCapabilities) = this()
	def setMode(value: js.Any): Unit = js.native
	def render(start: js.Any, count: Double): Unit = js.native
	def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLProgram")
class WebGLProgram extends js.Object:
	def this(renderer: WebGLRenderer, cacheKey: String, parameters: js.Object) = this()
	val name: String = js.native;
	val id: Double = js.native;
	val cacheKey: String = js.native;
	val usedTimes: Double = js.native;
	val program: js.Any = js.native;
	val vertexShader: WebGLShader = js.native;
	val fragmentShader: WebGLShader = js.native;
	val uniforms: js.Any = js.native;
	val attributes: js.Any = js.native;
	def getUniforms(): WebGLUniforms = js.native
	def getAttributes(): js.Any = js.native
	def destroy(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLIndexedBufferRenderer")
class WebGLIndexedBufferRenderer extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: js.Any, info: js.Any, capabilities: js.Any) = this()
	def setMode(value: js.Any): Unit = js.native
	def setIndex(index: js.Any): Unit = js.native
	def render(start: js.Any, count: Double): Unit = js.native
	def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLUniforms")
class WebGLUniforms extends js.Object:
	def this(gl: WebGLRenderingContext, program: WebGLProgram) = this()
	def setValue(gl: WebGLRenderingContext, name: String, value: js.Any, textures: WebGLTextures): Unit = js.native
	def setOptional(gl: WebGLRenderingContext, `object`: js.Any, name: String): Unit = js.native



object WebGLUniforms:
	def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[js.Any], textures: WebGLTextures): Unit = js.native
	def seqWithValue(seq: js.Any, values: js.Array[js.Any]): js.Array[js.Any] = js.native

@js.native
@JSGlobal("THREE.WebGLBindingStates")
class WebGLBindingStates extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: WebGLExtensions, attributes: WebGLAttributes, capabilities: WebGLCapabilities) = this()
	def setup(`object`: Object3D, material: Material, program: WebGLProgram, geometry: BufferGeometry, index: BufferAttribute): Unit = js.native
	def reset(): Unit = js.native
	def resetDefaultState(): Unit = js.native
	def dispose(): Unit = js.native
	def releaseStatesOfGeometry(): Unit = js.native
	def releaseStatesOfProgram(): Unit = js.native
	def initAttributes(): Unit = js.native
	def enableAttribute(attribute: Double): Unit = js.native
	def disableUnusedAttributes(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLProperties")
class WebGLProperties extends js.Object:
	def get(`object`: js.Any): js.Any = js.native
	def remove(`object`: js.Any): Unit = js.native
	def update(`object`: js.Any, key: js.Any, value: js.Any): js.Any = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLUtils")
class WebGLUtils extends js.Object:
	def this(gl: WebGLRenderingContext | WebGL2RenderingContext, extensions: js.Any, capabilities: js.Any) = this()
	def convert(p: js.Any): Unit = js.native
def WebGLShader(gl: WebGLRenderingContext, `type`: String, string: String): WebGLShader = js.native

@js.native
@JSGlobal("THREE.WebGLTextures")
class WebGLTextures extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: WebGLExtensions, state: WebGLState, properties: WebGLProperties, capabilities: WebGLCapabilities, utils: WebGLUtils, info: WebGLInfo) = this()
	def allocateTextureUnit(): Unit = js.native
	def resetTextureUnits(): Unit = js.native
	def setTexture2D(texture: js.Any, slot: Double): Unit = js.native
	def setTexture2DArray(texture: js.Any, slot: Double): Unit = js.native
	def setTexture3D(texture: js.Any, slot: Double): Unit = js.native
	def setTextureCube(texture: js.Any, slot: Double): Unit = js.native
	def setupRenderTarget(renderTarget: js.Any): Unit = js.native
	def updateRenderTargetMipmap(renderTarget: js.Any): Unit = js.native
	def updateMultisampleRenderTarget(renderTarget: js.Any): Unit = js.native
	def safeSetTexture2D(texture: js.Any, slot: Double): Unit = js.native
	def safeSetTextureCube(texture: js.Any, slot: Double): Unit = js.native

@js.native
sealed trait WebGLCapabilitiesParameters extends js.Object:
	val precision: js.UndefOr[String] = js.native;
	val logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.WebGLCapabilities")
class WebGLCapabilities extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
	var isWebGL2: Boolean = js.native;
	val precision: String = js.native;
	val logarithmicDepthBuffer: Boolean = js.native;
	val maxTextures: Double = js.native;
	val maxVertexTextures: Double = js.native;
	val maxTextureSize: Double = js.native;
	val maxCubemapSize: Double = js.native;
	val maxAttributes: Double = js.native;
	val maxVertexUniforms: Double = js.native;
	val maxVaryings: Double = js.native;
	val maxFragmentUniforms: Double = js.native;
	val vertexTextures: Boolean = js.native;
	val floatFragmentTextures: Boolean = js.native;
	val floatVertexTextures: Boolean = js.native;
	def getMaxAnisotropy(): Double = js.native
	def getMaxPrecision(precision: String): String = js.native

@js.native
@JSGlobal("THREE.WebGLGeometries")
class WebGLGeometries extends js.Object:
	def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
	def get(`object`: Object3D, geometry: BufferGeometry): BufferGeometry = js.native
	def update(geometry: BufferGeometry): Unit = js.native
	def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native

@js.native
@JSGlobal("THREE.WebGLClipping")
class WebGLClipping extends js.Object:
	def this(properties: WebGLProperties) = this()
	val uniform: objectType62 = js.native;
	val numPlanes: Double = js.native;
	val numIntersection: Double = js.native;
	def init(planes: js.Array[js.Any], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
	def beginShadows(): Unit = js.native
	def endShadows(): Unit = js.native
	def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLLights")
class WebGLLights extends js.Object:
	def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
	val state: objectType63 = js.native;
	def get(light: js.Any): js.Any = js.native
	def setup(lights: js.Any): Unit = js.native
	def setupView(lights: js.Any, camera: js.Any): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLAttributes")
class WebGLAttributes extends js.Object:
	def this(gl: WebGLRenderingContext | WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
	def get(attribute: BufferAttribute | InterleavedBufferAttribute): objectType64 = js.native
	def remove(attribute: BufferAttribute | InterleavedBufferAttribute): Unit = js.native
	def update(attribute: BufferAttribute | InterleavedBufferAttribute, bufferType: Double): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLCubeUVMaps")
class WebGLCubeUVMaps extends js.Object:
	def this(renderer: WebGLRenderer) = this()
	def get[T <: Texture](texture: T): T = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLColorBuffer")
class WebGLColorBuffer extends js.Object:
	def setMask(colorMask: Boolean): Unit = js.native
	def setLocked(lock: Boolean): Unit = js.native
	def setClear(r: Double, g: Double, b: Double, a: Double, premultipliedAlpha: Boolean): Unit = js.native
	def reset(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLDepthBuffer")
class WebGLDepthBuffer extends js.Object:
	def setTest(depthTest: Boolean): Unit = js.native
	def setMask(depthMask: Boolean): Unit = js.native
	def setFunc(depthFunc: DepthModes): Unit = js.native
	def setLocked(lock: Boolean): Unit = js.native
	def setClear(depth: Double): Unit = js.native
	def reset(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLStencilBuffer")
class WebGLStencilBuffer extends js.Object:
	def setTest(stencilTest: Boolean): Unit = js.native
	def setMask(stencilMask: Double): Unit = js.native
	def setFunc(stencilFunc: Double, stencilRef: Double, stencilMask: Double): Unit = js.native
	def setOp(stencilFail: Double, stencilZFail: Double, stencilZPass: Double): Unit = js.native
	def setLocked(lock: Boolean): Unit = js.native
	def setClear(stencil: Double): Unit = js.native
	def reset(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLState")
class WebGLState extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
	val buffers: objectType65 = js.native;
	def initAttributes(): Unit = js.native
	def enableAttribute(attribute: Double): Unit = js.native
	def enableAttributeAndDivisor(attribute: Double, meshPerAttribute: Double): Unit = js.native
	def disableUnusedAttributes(): Unit = js.native
	def vertexAttribPointer(index: Double, size: Double, `type`: Double, normalized: Boolean, stride: Double, offset: Double): Unit = js.native
	def enable(id: Double): Unit = js.native
	def disable(id: Double): Unit = js.native
	def bindFramebuffer(target: Double, framebuffer: WebGLFramebuffer | Null): Unit = js.native
	def bindXRFramebuffer(framebuffer: WebGLFramebuffer | Null): Unit = js.native
	def useProgram(program: js.Any): Boolean = js.native
	def setBlending(blending: Blending, blendEquation: js.UndefOr[BlendingEquation], blendSrc: js.UndefOr[BlendingSrcFactor], blendDst: js.UndefOr[BlendingDstFactor], blendEquationAlpha: js.UndefOr[BlendingEquation], blendSrcAlpha: js.UndefOr[BlendingSrcFactor], blendDstAlpha: js.UndefOr[BlendingDstFactor], premultiplyAlpha: js.UndefOr[Boolean]): Unit = js.native
	def setMaterial(material: Material, frontFaceCW: Boolean): Unit = js.native
	def setFlipSided(flipSided: Boolean): Unit = js.native
	def setCullFace(cullFace: CullFace): Unit = js.native
	def setLineWidth(width: Double): Unit = js.native
	def setPolygonOffset(polygonoffset: Boolean, factor: js.UndefOr[Double], units: js.UndefOr[Double]): Unit = js.native
	def setScissorTest(scissorTest: Boolean): Unit = js.native
	def activeTexture(webglSlot: Double): Unit = js.native
	def bindTexture(webglType: Double, webglTexture: js.Any): Unit = js.native
	def unbindTexture(): Unit = js.native
	def compressedTexImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, data: ArrayBufferView): Unit = js.native
	def texImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, format: Double, `type`: Double, pixels: ArrayBufferView | Null): Unit = js.native
	def texImage2D(target: Double, level: Double, internalformat: Double, format: Double, `type`: Double, source: js.Any): Unit = js.native
	def texImage3D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, depth: Double, border: Double, format: Double, `type`: Double, pixels: js.Any): Unit = js.native
	def scissor(scissor: Vector4): Unit = js.native
	def viewport(viewport: Vector4): Unit = js.native
	def reset(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLCubeMaps")
class WebGLCubeMaps extends js.Object:
	def this(renderer: WebGLRenderer) = this()
	def get(texture: js.Any): js.Any = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLObjects")
class WebGLObjects extends js.Object:
	def this(gl: WebGLRenderingContext, geometries: js.Any, attributes: js.Any, info: js.Any) = this()
	def update(`object`: js.Any): js.Any = js.native
	def dispose(): Unit = js.native

@js.native
sealed trait objectType58 extends js.Object:
	val ambientLightColor: IUniform[js.Any] = js.native;
	val directionalLights: objectType66 = js.native;
	val directionalLightShadows: objectType67 = js.native;
	val directionalShadowMap: IUniform[js.Any] = js.native;
	val directionalShadowMatrix: IUniform[js.Any] = js.native;
	val spotLights: objectType68 = js.native;
	val spotLightShadows: objectType67 = js.native;
	val spotShadowMap: IUniform[js.Any] = js.native;
	val spotShadowMatrix: IUniform[js.Any] = js.native;
	val pointLights: objectType69 = js.native;
	val pointLightShadows: objectType67 = js.native;
	val pointShadowMap: IUniform[js.Any] = js.native;
	val pointShadowMatrix: IUniform[js.Any] = js.native;
	val hemisphereLights: objectType70 = js.native;
	val rectAreaLights: objectType71 = js.native;

@js.native
sealed trait objectType65 extends js.Object:
	val color: WebGLColorBuffer = js.native;
	val depth: WebGLDepthBuffer = js.native;
	val stencil: WebGLStencilBuffer = js.native;

@js.native
sealed trait objectType55 extends js.Object:
	val metalnessMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType57 extends js.Object:
	val fogDensity: IUniform[js.Any] = js.native;
	val fogNear: IUniform[js.Any] = js.native;
	val fogFar: IUniform[js.Any] = js.native;
	val fogColor: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType51 extends js.Object:
	val bumpMap: IUniform[js.Any] = js.native;
	val bumpScale: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType63 extends js.Object:
	val version: Double = js.native;
	val hash: objectType72 = js.native;
	val ambient: js.Array[Double] = js.native;
	val probe: js.Array[js.Any] = js.native;
	val directional: js.Array[js.Any] = js.native;
	val directionalShadow: js.Array[js.Any] = js.native;
	val directionalShadowMap: js.Array[js.Any] = js.native;
	val directionalShadowMatrix: js.Array[js.Any] = js.native;
	val spot: js.Array[js.Any] = js.native;
	val spotShadow: js.Array[js.Any] = js.native;
	val spotShadowMap: js.Array[js.Any] = js.native;
	val spotShadowMatrix: js.Array[js.Any] = js.native;
	val rectArea: js.Array[js.Any] = js.native;
	val point: js.Array[js.Any] = js.native;
	val pointShadow: js.Array[js.Any] = js.native;
	val pointShadowMap: js.Array[js.Any] = js.native;
	val pointShadowMatrix: js.Array[js.Any] = js.native;
	val hemi: js.Array[js.Any] = js.native;

@js.native
sealed trait objectType56 extends js.Object:
	val gradientMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType60 extends js.Object:
	val geometries: Double = js.native;
	val textures: Double = js.native;

@js.native
sealed trait objectType45 extends js.Object:
	val diffuse: IUniform[js.Any] = js.native;
	val opacity: IUniform[js.Any] = js.native;
	val map: IUniform[js.Any] = js.native;
	val uvTransform: IUniform[js.Any] = js.native;
	val uv2Transform: IUniform[js.Any] = js.native;
	val alphaMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType53 extends js.Object:
	val displacementMap: IUniform[js.Any] = js.native;
	val displacementScale: IUniform[js.Any] = js.native;
	val displacementBias: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType62 extends js.Object:
	val value: js.Any = js.native;
	val needsUpdate: Boolean = js.native;

@js.native
sealed trait objectType48 extends js.Object:
	val aoMap: IUniform[js.Any] = js.native;
	val aoMapIntensity: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType49 extends js.Object:
	val lightMap: IUniform[js.Any] = js.native;
	val lightMapIntensity: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType54 extends js.Object:
	val roughnessMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType61 extends js.Object:
	val calls: Double = js.native;
	val frame: Double = js.native;
	val lines: Double = js.native;
	val points: Double = js.native;
	val triangles: Double = js.native;

@js.native
sealed trait objectType46 extends js.Object:
	val specularMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType47 extends js.Object:
	val envMap: IUniform[js.Any] = js.native;
	val flipEnvMap: IUniform[js.Any] = js.native;
	val reflectivity: IUniform[js.Any] = js.native;
	val refractionRatio: IUniform[js.Any] = js.native;
	val maxMipLevel: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType59 extends js.Object:
	val diffuse: IUniform[js.Any] = js.native;
	val opacity: IUniform[js.Any] = js.native;
	val size: IUniform[js.Any] = js.native;
	val scale: IUniform[js.Any] = js.native;
	val map: IUniform[js.Any] = js.native;
	val uvTransform: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType50 extends js.Object:
	val emissiveMap: IUniform[js.Any] = js.native;

@js.native
sealed trait objectType64 extends js.Object:
	val buffer: WebGLBuffer = js.native;
	val `type`: Double = js.native;
	val bytesPerElement: Double = js.native;
	val version: Double = js.native;

@js.native
sealed trait objectType52 extends js.Object:
	val normalMap: IUniform[js.Any] = js.native;
	val normalScale: IUniform[js.Any] = js.native;
