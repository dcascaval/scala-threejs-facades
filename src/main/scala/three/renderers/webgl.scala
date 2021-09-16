package typings.three.renderers.webgl

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
trait RenderTarget extends js.Object

@js.native
trait RenderItem extends js.Object:
	var id: Double = js.native
	var `object`: Object3D = js.native
	var geometry: BufferGeometry = js.native
	var material: Material = js.native
	var program: WebGLProgram = js.native
	var groupOrder: Double = js.native
	var renderOrder: Double = js.native
	var z: Double = js.native
	var group: Group = js.native

@js.native
@JSGlobal("THREE.WebGLRenderList")
class WebGLRenderList extends js.Object:
	def this(properties: WebGLProperties) = this()
	var opaque: js.Array[RenderItem] = js.native
	var transparent: js.Array[RenderItem] = js.native
	def init(): Unit = js.native
	def push(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double, group: Group): Unit = js.native
	def unshift(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double, group: Group): Unit = js.native
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
	var enabled: Boolean = js.native
	var autoUpdate: Boolean = js.native
	var needsUpdate: Boolean = js.native
	var `type`: ShadowMapType = js.native
	var cullFace: js.Any = js.native
	def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLPrograms")
class WebGLPrograms extends js.Object:
	def this(renderer: WebGLRenderer, cubemaps: WebGLCubeMaps, extensions: WebGLExtensions, capabilities: WebGLCapabilities, bindingStates: WebGLBindingStates, clipping: WebGLClipping) = this()
	var programs: js.Array[WebGLProgram] = js.native
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
	var autoReset: Boolean = js.native
	var memory: AnonObject58 = js.native
	var programs: js.Array[WebGLProgram] = js.native
	var render: AnonObject59 = js.native
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
	var name: String = js.native
	var id: Double = js.native
	var cacheKey: String = js.native
	var usedTimes: Double = js.native
	var program: js.Any = js.native
	var vertexShader: WebGLShader = js.native
	var fragmentShader: WebGLShader = js.native
	var uniforms: js.Any = js.native
	var attributes: js.Any = js.native
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



@js.native
@JSGlobal("THREE.WebGLUniforms")
object WebGLUniforms extends js.Object:
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
@js.native
@JSGlobal("THREE.WebGLShader")
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


trait WebGLCapabilitiesParameters extends js.Object:
	var precision: js.UndefOr[String] = js.undefined
	var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined

@js.native
@JSGlobal("THREE.WebGLCapabilities")
class WebGLCapabilities extends js.Object:
	def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
	val isWebGL2: Boolean = js.native
	var precision: String = js.native
	var logarithmicDepthBuffer: Boolean = js.native
	var maxTextures: Double = js.native
	var maxVertexTextures: Double = js.native
	var maxTextureSize: Double = js.native
	var maxCubemapSize: Double = js.native
	var maxAttributes: Double = js.native
	var maxVertexUniforms: Double = js.native
	var maxVaryings: Double = js.native
	var maxFragmentUniforms: Double = js.native
	var vertexTextures: Boolean = js.native
	var floatFragmentTextures: Boolean = js.native
	var floatVertexTextures: Boolean = js.native
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
	var uniform: AnonObject60 = js.native
	var numPlanes: Double = js.native
	var numIntersection: Double = js.native
	def init(planes: js.Array[js.Any], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
	def beginShadows(): Unit = js.native
	def endShadows(): Unit = js.native
	def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLLights")
class WebGLLights extends js.Object:
	def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
	var state: AnonObject61 = js.native
	def get(light: js.Any): js.Any = js.native
	def setup(lights: js.Any): Unit = js.native
	def setupView(lights: js.Any, camera: js.Any): Unit = js.native

@js.native
@JSGlobal("THREE.WebGLAttributes")
class WebGLAttributes extends js.Object:
	def this(gl: WebGLRenderingContext | WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
	def get(attribute: BufferAttribute | InterleavedBufferAttribute): AnonObject62 = js.native
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
	var buffers: AnonObject63 = js.native
	def initAttributes(): Unit = js.native
	def enableAttribute(attribute: Double): Unit = js.native
	def enableAttributeAndDivisor(attribute: Double, meshPerAttribute: Double): Unit = js.native
	def disableUnusedAttributes(): Unit = js.native
	def vertexAttribPointer(index: Double, size: Double, `type`: Double, normalized: Boolean, stride: Double, offset: Double): Unit = js.native
	def enable(id: Double): Unit = js.native
	def disable(id: Double): Unit = js.native
	def bindFramebuffer(target: Double, framebuffer: WebGLFramebuffer): Unit = js.native
	def bindXRFramebuffer(framebuffer: WebGLFramebuffer): Unit = js.native
	def useProgram(program: js.Any): Boolean = js.native
	def setBlending(blending: Blending, blendEquation: js.UndefOr[BlendingEquation] = js.undefined, blendSrc: js.UndefOr[BlendingSrcFactor] = js.undefined, blendDst: js.UndefOr[BlendingDstFactor] = js.undefined, blendEquationAlpha: js.UndefOr[BlendingEquation] = js.undefined, blendSrcAlpha: js.UndefOr[BlendingSrcFactor] = js.undefined, blendDstAlpha: js.UndefOr[BlendingDstFactor] = js.undefined, premultiplyAlpha: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	def setMaterial(material: Material, frontFaceCW: Boolean): Unit = js.native
	def setFlipSided(flipSided: Boolean): Unit = js.native
	def setCullFace(cullFace: CullFace): Unit = js.native
	def setLineWidth(width: Double): Unit = js.native
	def setPolygonOffset(polygonoffset: Boolean, factor: js.UndefOr[Double] = js.undefined, units: js.UndefOr[Double] = js.undefined): Unit = js.native
	def setScissorTest(scissorTest: Boolean): Unit = js.native
	def activeTexture(webglSlot: Double): Unit = js.native
	def bindTexture(webglType: Double, webglTexture: js.Any): Unit = js.native
	def unbindTexture(): Unit = js.native
	def compressedTexImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, data: ArrayBufferView): Unit = js.native
	def texImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, format: Double, `type`: Double, pixels: ArrayBufferView): Unit = js.native
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
trait AnonObject56 extends js.Object:
	var ambientLightColor: IUniform[js.Any] = js.native
	var directionalLights: AnonObject64 = js.native
	var directionalLightShadows: AnonObject65 = js.native
	var directionalShadowMap: IUniform[js.Any] = js.native
	var directionalShadowMatrix: IUniform[js.Any] = js.native
	var spotLights: AnonObject66 = js.native
	var spotLightShadows: AnonObject65 = js.native
	var spotShadowMap: IUniform[js.Any] = js.native
	var spotShadowMatrix: IUniform[js.Any] = js.native
	var pointLights: AnonObject67 = js.native
	var pointLightShadows: AnonObject65 = js.native
	var pointShadowMap: IUniform[js.Any] = js.native
	var pointShadowMatrix: IUniform[js.Any] = js.native
	var hemisphereLights: AnonObject68 = js.native
	var rectAreaLights: AnonObject69 = js.native

@js.native
trait AnonObject63 extends js.Object:
	var color: WebGLColorBuffer = js.native
	var depth: WebGLDepthBuffer = js.native
	var stencil: WebGLStencilBuffer = js.native

@js.native
trait AnonObject53 extends js.Object:
	var metalnessMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject55 extends js.Object:
	var fogDensity: IUniform[js.Any] = js.native
	var fogNear: IUniform[js.Any] = js.native
	var fogFar: IUniform[js.Any] = js.native
	var fogColor: IUniform[js.Any] = js.native

@js.native
trait AnonObject49 extends js.Object:
	var bumpMap: IUniform[js.Any] = js.native
	var bumpScale: IUniform[js.Any] = js.native

@js.native
trait AnonObject61 extends js.Object:
	var version: Double = js.native
	var hash: AnonObject70 = js.native
	var ambient: js.Array[Double] = js.native
	var probe: js.Array[js.Any] = js.native
	var directional: js.Array[js.Any] = js.native
	var directionalShadow: js.Array[js.Any] = js.native
	var directionalShadowMap: js.Array[js.Any] = js.native
	var directionalShadowMatrix: js.Array[js.Any] = js.native
	var spot: js.Array[js.Any] = js.native
	var spotShadow: js.Array[js.Any] = js.native
	var spotShadowMap: js.Array[js.Any] = js.native
	var spotShadowMatrix: js.Array[js.Any] = js.native
	var rectArea: js.Array[js.Any] = js.native
	var point: js.Array[js.Any] = js.native
	var pointShadow: js.Array[js.Any] = js.native
	var pointShadowMap: js.Array[js.Any] = js.native
	var pointShadowMatrix: js.Array[js.Any] = js.native
	var hemi: js.Array[js.Any] = js.native

@js.native
trait AnonObject54 extends js.Object:
	var gradientMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject58 extends js.Object:
	var geometries: Double = js.native
	var textures: Double = js.native

@js.native
trait AnonObject43 extends js.Object:
	var diffuse: IUniform[js.Any] = js.native
	var opacity: IUniform[js.Any] = js.native
	var map: IUniform[js.Any] = js.native
	var uvTransform: IUniform[js.Any] = js.native
	var uv2Transform: IUniform[js.Any] = js.native
	var alphaMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject51 extends js.Object:
	var displacementMap: IUniform[js.Any] = js.native
	var displacementScale: IUniform[js.Any] = js.native
	var displacementBias: IUniform[js.Any] = js.native

@js.native
trait AnonObject60 extends js.Object:
	var value: js.Any = js.native
	var needsUpdate: Boolean = js.native

@js.native
trait AnonObject46 extends js.Object:
	var aoMap: IUniform[js.Any] = js.native
	var aoMapIntensity: IUniform[js.Any] = js.native

@js.native
trait AnonObject47 extends js.Object:
	var lightMap: IUniform[js.Any] = js.native
	var lightMapIntensity: IUniform[js.Any] = js.native

@js.native
trait AnonObject52 extends js.Object:
	var roughnessMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject59 extends js.Object:
	var calls: Double = js.native
	var frame: Double = js.native
	var lines: Double = js.native
	var points: Double = js.native
	var triangles: Double = js.native

@js.native
trait AnonObject44 extends js.Object:
	var specularMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject45 extends js.Object:
	var envMap: IUniform[js.Any] = js.native
	var flipEnvMap: IUniform[js.Any] = js.native
	var reflectivity: IUniform[js.Any] = js.native
	var refractionRatio: IUniform[js.Any] = js.native
	var maxMipLevel: IUniform[js.Any] = js.native

@js.native
trait AnonObject57 extends js.Object:
	var diffuse: IUniform[js.Any] = js.native
	var opacity: IUniform[js.Any] = js.native
	var size: IUniform[js.Any] = js.native
	var scale: IUniform[js.Any] = js.native
	var map: IUniform[js.Any] = js.native
	var uvTransform: IUniform[js.Any] = js.native

@js.native
trait AnonObject48 extends js.Object:
	var emissiveMap: IUniform[js.Any] = js.native

@js.native
trait AnonObject62 extends js.Object:
	var buffer: WebGLBuffer = js.native
	var `type`: Double = js.native
	var bytesPerElement: Double = js.native
	var version: Double = js.native

@js.native
trait AnonObject50 extends js.Object:
	var normalMap: IUniform[js.Any] = js.native
	var normalScale: IUniform[js.Any] = js.native
