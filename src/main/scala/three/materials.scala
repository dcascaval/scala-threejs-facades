package typings.three.materials

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
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*



trait MeshPhongMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var specular: js.UndefOr[ColorRepresentation] = js.undefined
	var shininess: js.UndefOr[Double] = js.undefined

	var map: js.UndefOr[Texture] = js.undefined
	var lightMap: js.UndefOr[Texture] = js.undefined
	var lightMapIntensity: js.UndefOr[Double] = js.undefined
	var aoMap: js.UndefOr[Texture] = js.undefined
	var aoMapIntensity: js.UndefOr[Double] = js.undefined
	var emissive: js.UndefOr[ColorRepresentation] = js.undefined
	var emissiveIntensity: js.UndefOr[Double] = js.undefined
	var emissiveMap: js.UndefOr[Texture] = js.undefined
	var bumpMap: js.UndefOr[Texture] = js.undefined
	var bumpScale: js.UndefOr[Double] = js.undefined
	var normalMap: js.UndefOr[Texture] = js.undefined
	var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
	var normalScale: js.UndefOr[Vector2] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var specularMap: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var envMap: js.UndefOr[Texture] = js.undefined
	var combine: js.UndefOr[Combine] = js.undefined
	var reflectivity: js.UndefOr[Double] = js.undefined
	var refractionRatio: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var wireframeLinecap: js.UndefOr[String] = js.undefined
	var wireframeLinejoin: js.UndefOr[String] = js.undefined
	var flatShading: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","MeshPhongMaterial")
class MeshPhongMaterial extends Material:
	def this(parameters: MeshPhongMaterialParameters) = this()

	var color: Color = js.native
	var specular: Color = js.native
	var shininess: Double = js.native
	var map: Texture = js.native
	var lightMap: Texture = js.native
	var lightMapIntensity: Double = js.native
	var aoMap: Texture = js.native
	var aoMapIntensity: Double = js.native
	var emissive: Color = js.native
	var emissiveIntensity: Double = js.native
	var emissiveMap: Texture = js.native
	var bumpMap: Texture = js.native
	var bumpScale: Double = js.native
	var normalMap: Texture = js.native
	var normalMapType: NormalMapTypes = js.native
	var normalScale: Vector2 = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var specularMap: Texture = js.native
	var alphaMap: Texture = js.native
	var envMap: Texture = js.native
	var combine: Combine = js.native
	var reflectivity: Double = js.native
	var refractionRatio: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var wireframeLinecap: String = js.native
	var wireframeLinejoin: String = js.native
	var flatShading: Boolean = js.native
	var metal: Boolean = js.native



trait ShaderMaterialParameters extends MaterialParameters:
	var uniforms: js.UndefOr[AnonObject31] = js.undefined
	var vertexShader: js.UndefOr[String] = js.undefined
	var fragmentShader: js.UndefOr[String] = js.undefined
	var linewidth: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var lights: js.UndefOr[Boolean] = js.undefined
	var clipping: js.UndefOr[Boolean] = js.undefined
	var extensions: js.UndefOr[AnonObject32] = js.undefined
	var glslVersion: js.UndefOr[GLSLVersion] = js.undefined

@js.native
@JSImport("three","ShaderMaterial")
class ShaderMaterial extends Material:
	def this(parameters: ShaderMaterialParameters) = this()


	var uniforms: AnonObject31 = js.native
	var vertexShader: String = js.native
	var fragmentShader: String = js.native
	var linewidth: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native

	var lights: Boolean = js.native
	var clipping: Boolean = js.native
	var derivatives: js.Any = js.native
	var extensions: AnonObject33 = js.native
	var defaultAttributeValues: js.Any = js.native
	var index0AttributeName: js.UndefOr[String] = js.native
	var uniformsNeedUpdate: Boolean = js.native
	var glslVersion: GLSLVersion = js.native
	var isShaderMaterial: Boolean = js.native




trait MeshNormalMaterialParameters extends MaterialParameters:
	var bumpMap: js.UndefOr[Texture] = js.undefined
	var bumpScale: js.UndefOr[Double] = js.undefined
	var normalMap: js.UndefOr[Texture] = js.undefined
	var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
	var normalScale: js.UndefOr[Vector2] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var flatShading: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","MeshNormalMaterial")
class MeshNormalMaterial extends Material:
	def this(parameters: MeshNormalMaterialParameters) = this()

	var bumpMap: Texture = js.native
	var bumpScale: Double = js.native
	var normalMap: Texture = js.native
	var normalMapType: NormalMapTypes = js.native
	var normalScale: Vector2 = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var flatShading: Boolean = js.native



trait MeshDistanceMaterialParameters extends MaterialParameters:
	var map: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var farDistance: js.UndefOr[Double] = js.undefined
	var nearDistance: js.UndefOr[Double] = js.undefined
	var referencePosition: js.UndefOr[Vector3] = js.undefined

@js.native
@JSImport("three","MeshDistanceMaterial")
class MeshDistanceMaterial extends Material:
	def this(parameters: MeshDistanceMaterialParameters) = this()

	var map: Texture = js.native
	var alphaMap: Texture = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var farDistance: Double = js.native
	var nearDistance: Double = js.native
	var referencePosition: Vector3 = js.native




trait LineDashedMaterialParameters extends LineBasicMaterialParameters:
	var scale: js.UndefOr[Double] = js.undefined
	var dashSize: js.UndefOr[Double] = js.undefined
	var gapSize: js.UndefOr[Double] = js.undefined

@js.native
@JSImport("three","LineDashedMaterial")
class LineDashedMaterial extends LineBasicMaterial:
	def this(parameters: LineDashedMaterialParameters) = this()

	var scale: Double = js.native
	var dashSize: Double = js.native
	var gapSize: Double = js.native
	val isLineDashedMaterial: Boolean = js.native



trait MeshDepthMaterialParameters extends MaterialParameters:
	var map: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var depthPacking: js.UndefOr[DepthPackingStrategies] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined

@js.native
@JSImport("three","MeshDepthMaterial")
class MeshDepthMaterial extends Material:
	def this(parameters: MeshDepthMaterialParameters) = this()

	var map: Texture = js.native
	var alphaMap: Texture = js.native
	var depthPacking: DepthPackingStrategies = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native




trait SpriteMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var rotation: js.UndefOr[Double] = js.undefined
	var sizeAttenuation: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","SpriteMaterial")
class SpriteMaterial extends Material:
	def this(parameters: SpriteMaterialParameters) = this()

	var color: Color = js.native
	var map: Texture = js.native
	var alphaMap: Texture = js.native
	var rotation: Double = js.native
	var sizeAttenuation: Boolean = js.native

	val isSpriteMaterial: Boolean = js.native




trait MeshToonMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined

	var gradientMap: js.UndefOr[Texture] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var lightMap: js.UndefOr[Texture] = js.undefined
	var lightMapIntensity: js.UndefOr[Double] = js.undefined
	var aoMap: js.UndefOr[Texture] = js.undefined
	var aoMapIntensity: js.UndefOr[Double] = js.undefined
	var emissive: js.UndefOr[ColorRepresentation] = js.undefined
	var emissiveIntensity: js.UndefOr[Double] = js.undefined
	var emissiveMap: js.UndefOr[Texture] = js.undefined
	var bumpMap: js.UndefOr[Texture] = js.undefined
	var bumpScale: js.UndefOr[Double] = js.undefined
	var normalMap: js.UndefOr[Texture] = js.undefined
	var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
	var normalScale: js.UndefOr[Vector2] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var wireframeLinecap: js.UndefOr[String] = js.undefined
	var wireframeLinejoin: js.UndefOr[String] = js.undefined

@js.native
@JSImport("three","MeshToonMaterial")
class MeshToonMaterial extends Material:
	def this(parameters: MeshToonMaterialParameters) = this()


	var color: Color = js.native
	var gradientMap: Texture = js.native
	var map: Texture = js.native
	var lightMap: Texture = js.native
	var lightMapIntensity: Double = js.native
	var aoMap: Texture = js.native
	var aoMapIntensity: Double = js.native
	var emissive: Color = js.native
	var emissiveIntensity: Double = js.native
	var emissiveMap: Texture = js.native
	var bumpMap: Texture = js.native
	var bumpScale: Double = js.native
	var normalMap: Texture = js.native
	var normalMapType: NormalMapTypes = js.native
	var normalScale: Vector2 = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var alphaMap: Texture = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var wireframeLinecap: String = js.native
	var wireframeLinejoin: String = js.native



trait LineBasicMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var linewidth: js.UndefOr[Double] = js.undefined
	var linecap: js.UndefOr[String] = js.undefined
	var linejoin: js.UndefOr[String] = js.undefined

@js.native
@JSImport("three","LineBasicMaterial")
class LineBasicMaterial extends Material:
	def this(parameters: LineBasicMaterialParameters) = this()

	var color: Color = js.native
	var linewidth: Double = js.native
	var linecap: String = js.native
	var linejoin: String = js.native



trait MeshMatcapMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var matcap: js.UndefOr[Texture] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var bumpMap: js.UndefOr[Texture] = js.undefined
	var bumpScale: js.UndefOr[Double] = js.undefined
	var normalMap: js.UndefOr[Texture] = js.undefined
	var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
	var normalScale: js.UndefOr[Vector2] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var flatShading: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","MeshMatcapMaterial")
class MeshMatcapMaterial extends Material:
	def this(parameters: MeshMatcapMaterialParameters) = this()


	var color: Color = js.native
	var matcap: Texture = js.native
	var map: Texture = js.native
	var bumpMap: Texture = js.native
	var bumpScale: Double = js.native
	var normalMap: Texture = js.native
	var normalMapType: NormalMapTypes = js.native
	var normalScale: Vector2 = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var alphaMap: Texture = js.native
	var flatShading: Boolean = js.native



trait ShadowMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined

@js.native
@JSImport("three","ShadowMaterial")
class ShadowMaterial extends Material:
	def this(parameters: ShadowMaterialParameters) = this()

	var color: Color = js.native



trait MeshStandardMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var roughness: js.UndefOr[Double] = js.undefined
	var metalness: js.UndefOr[Double] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var lightMap: js.UndefOr[Texture] = js.undefined
	var lightMapIntensity: js.UndefOr[Double] = js.undefined
	var aoMap: js.UndefOr[Texture] = js.undefined
	var aoMapIntensity: js.UndefOr[Double] = js.undefined
	var emissive: js.UndefOr[ColorRepresentation] = js.undefined
	var emissiveIntensity: js.UndefOr[Double] = js.undefined
	var emissiveMap: js.UndefOr[Texture] = js.undefined
	var bumpMap: js.UndefOr[Texture] = js.undefined
	var bumpScale: js.UndefOr[Double] = js.undefined
	var normalMap: js.UndefOr[Texture] = js.undefined
	var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
	var normalScale: js.UndefOr[Vector2] = js.undefined
	var displacementMap: js.UndefOr[Texture] = js.undefined
	var displacementScale: js.UndefOr[Double] = js.undefined
	var displacementBias: js.UndefOr[Double] = js.undefined
	var roughnessMap: js.UndefOr[Texture] = js.undefined
	var metalnessMap: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var envMap: js.UndefOr[Texture] = js.undefined
	var envMapIntensity: js.UndefOr[Double] = js.undefined
	var refractionRatio: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var flatShading: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","MeshStandardMaterial")
class MeshStandardMaterial extends Material:
	def this(parameters: MeshStandardMaterialParameters) = this()


	var color: Color = js.native
	var roughness: Double = js.native
	var metalness: Double = js.native
	var map: Texture = js.native
	var lightMap: Texture = js.native
	var lightMapIntensity: Double = js.native
	var aoMap: Texture = js.native
	var aoMapIntensity: Double = js.native
	var emissive: Color = js.native
	var emissiveIntensity: Double = js.native
	var emissiveMap: Texture = js.native
	var bumpMap: Texture = js.native
	var bumpScale: Double = js.native
	var normalMap: Texture = js.native
	var normalMapType: NormalMapTypes = js.native
	var normalScale: Vector2 = js.native
	var displacementMap: Texture = js.native
	var displacementScale: Double = js.native
	var displacementBias: Double = js.native
	var roughnessMap: Texture = js.native
	var metalnessMap: Texture = js.native
	var alphaMap: Texture = js.native
	var envMap: Texture = js.native
	var envMapIntensity: Double = js.native
	var refractionRatio: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var wireframeLinecap: String = js.native
	var wireframeLinejoin: String = js.native
	var flatShading: Boolean = js.native
	var isMeshStandardMaterial: Boolean = js.native



trait PointsMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var size: js.UndefOr[Double] = js.undefined
	var sizeAttenuation: js.UndefOr[Boolean] = js.undefined

@js.native
@JSImport("three","PointsMaterial")
class PointsMaterial extends Material:
	def this(parameters: PointsMaterialParameters) = this()

	var color: Color = js.native
	var map: Texture = js.native
	var alphaMap: Texture = js.native
	var size: Double = js.native
	var sizeAttenuation: Boolean = js.native



trait MaterialParameters extends js.Object:
	var alphaTest: js.UndefOr[Double] = js.undefined
	var alphaToCoverage: js.UndefOr[Boolean] = js.undefined
	var blendDst: js.UndefOr[BlendingDstFactor] = js.undefined
	var blendDstAlpha: js.UndefOr[Double] = js.undefined
	var blendEquation: js.UndefOr[BlendingEquation] = js.undefined
	var blendEquationAlpha: js.UndefOr[Double] = js.undefined
	var blending: js.UndefOr[Blending] = js.undefined
	var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.undefined
	var blendSrcAlpha: js.UndefOr[Double] = js.undefined
	var clipIntersection: js.UndefOr[Boolean] = js.undefined
	var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.undefined
	var clipShadows: js.UndefOr[Boolean] = js.undefined
	var colorWrite: js.UndefOr[Boolean] = js.undefined
	var defines: js.UndefOr[js.Any] = js.undefined
	var depthFunc: js.UndefOr[DepthModes] = js.undefined
	var depthTest: js.UndefOr[Boolean] = js.undefined
	var depthWrite: js.UndefOr[Boolean] = js.undefined
	var fog: js.UndefOr[Boolean] = js.undefined
	var name: js.UndefOr[String] = js.undefined
	var opacity: js.UndefOr[Double] = js.undefined
	var polygonOffset: js.UndefOr[Boolean] = js.undefined
	var polygonOffsetFactor: js.UndefOr[Double] = js.undefined
	var polygonOffsetUnits: js.UndefOr[Double] = js.undefined
	var precision: js.UndefOr["highp" | "mediump" | "lowp"] = js.undefined
	var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
	var dithering: js.UndefOr[Boolean] = js.undefined
	var side: js.UndefOr[Side] = js.undefined
	var shadowSide: js.UndefOr[Side] = js.undefined
	var toneMapped: js.UndefOr[Boolean] = js.undefined
	var transparent: js.UndefOr[Boolean] = js.undefined
	var vertexColors: js.UndefOr[Boolean] = js.undefined
	var visible: js.UndefOr[Boolean] = js.undefined
	var stencilWrite: js.UndefOr[Boolean] = js.undefined
	var stencilFunc: js.UndefOr[StencilFunc] = js.undefined
	var stencilRef: js.UndefOr[Double] = js.undefined
	var stencilWriteMask: js.UndefOr[Double] = js.undefined
	var stencilFuncMask: js.UndefOr[Double] = js.undefined
	var stencilFail: js.UndefOr[StencilOp] = js.undefined
	var stencilZFail: js.UndefOr[StencilOp] = js.undefined
	var stencilZPass: js.UndefOr[StencilOp] = js.undefined
	var userData: js.UndefOr[js.Any] = js.undefined

@js.native
@JSImport("three","Material")
class Material extends EventDispatcher:
	var alphaTest: Double = js.native
	var alphaToCoverage: Boolean = js.native
	var blendDst: BlendingDstFactor = js.native
	var blendDstAlpha: Double = js.native
	var blendEquation: BlendingEquation = js.native
	var blendEquationAlpha: Double = js.native
	var blending: Blending = js.native
	var blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native
	var blendSrcAlpha: Double = js.native
	var clipIntersection: Boolean = js.native
	var clippingPlanes: js.Any = js.native
	var clipShadows: Boolean = js.native
	var colorWrite: Boolean = js.native
	var defines: js.UndefOr[AnonObject34] = js.native
	var depthFunc: DepthModes = js.native
	var depthTest: Boolean = js.native
	var depthWrite: Boolean = js.native
	var fog: Boolean = js.native
	var id: Double = js.native
	var stencilWrite: Boolean = js.native
	var stencilFunc: StencilFunc = js.native
	var stencilRef: Double = js.native
	var stencilWriteMask: Double = js.native
	var stencilFuncMask: Double = js.native
	var stencilFail: StencilOp = js.native
	var stencilZFail: StencilOp = js.native
	var stencilZPass: StencilOp = js.native
	val isMaterial: Boolean = js.native
	var name: String = js.native
	var needsUpdate: Boolean = js.native
	var opacity: Double = js.native
	var polygonOffset: Boolean = js.native
	var polygonOffsetFactor: Double = js.native
	var polygonOffsetUnits: Double = js.native
	var precision: "highp" | "mediump" | "lowp" = js.native
	var premultipliedAlpha: Boolean = js.native
	var dithering: Boolean = js.native
	var side: Side = js.native
	var shadowSide: Side = js.native
	var toneMapped: Boolean = js.native
	var transparent: Boolean = js.native
	var `type`: String = js.native
	var uuid: String = js.native
	var vertexColors: Boolean = js.native
	var visible: Boolean = js.native
	var userData: js.Any = js.native
	var version: Double = js.native
	@JSName("clone")
	def jsClone(): this.type = js.native
	def copy(material: Material): this.type = js.native
	def dispose(): Unit = js.native
	def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
	def customProgramCacheKey(): String = js.native
	def setValues(values: MaterialParameters): Unit = js.native
	def toJSON(meta: js.UndefOr[js.Any] = js.undefined): js.Any = js.native


trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters:
	var clearcoat: js.UndefOr[Double] = js.undefined
	var clearcoatMap: js.UndefOr[Texture] = js.undefined
	var clearcoatRoughness: js.UndefOr[Double] = js.undefined
	var clearcoatRoughnessMap: js.UndefOr[Texture] = js.undefined
	var clearcoatNormalScale: js.UndefOr[Vector2] = js.undefined
	var clearcoatNormalMap: js.UndefOr[Texture] = js.undefined
	var reflectivity: js.UndefOr[Double] = js.undefined
	var ior: js.UndefOr[Double] = js.undefined
	var sheen: js.UndefOr[Color] = js.undefined
	var transmission: js.UndefOr[Double] = js.undefined
	var transmissionMap: js.UndefOr[Texture] = js.undefined
	var attenuationDistance: js.UndefOr[Double] = js.undefined
	var attenuationTint: js.UndefOr[Color] = js.undefined
	var specularIntensity: js.UndefOr[Double] = js.undefined
	var specularTint: js.UndefOr[Color] = js.undefined
	var specularIntensityMap: js.UndefOr[Texture] = js.undefined
	var specularTintMap: js.UndefOr[Texture] = js.undefined

@js.native
@JSImport("three","MeshPhysicalMaterial")
class MeshPhysicalMaterial extends MeshStandardMaterial:
	def this(parameters: MeshPhysicalMaterialParameters) = this()


	var clearcoat: Double = js.native
	var clearcoatMap: Texture = js.native
	var clearcoatRoughness: Double = js.native
	var clearcoatRoughnessMap: Texture = js.native
	var clearcoatNormalScale: Vector2 = js.native
	var clearcoatNormalMap: Texture = js.native
	var reflectivity: Double = js.native
	var ior: Double = js.native
	var sheen: Color = js.native
	var transmission: Double = js.native
	var transmissionMap: Texture = js.native
	var thickness: Double = js.native
	var thicknessMap: Texture = js.native
	var attenuationDistance: Double = js.native
	var attenuationColor: Color = js.native
	var specularIntensity: Double = js.native
	var specularTint: Color = js.native
	var specularIntensityMap: Texture = js.native
	var specularTintMap: Texture = js.native

@js.native
@JSImport("three","RawShaderMaterial")
class RawShaderMaterial extends ShaderMaterial:
	def this(parameters: ShaderMaterialParameters) = this()


trait MeshBasicMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined

	var map: js.UndefOr[Texture] = js.undefined
	var lightMap: js.UndefOr[Texture] = js.undefined
	var lightMapIntensity: js.UndefOr[Double] = js.undefined
	var aoMap: js.UndefOr[Texture] = js.undefined
	var aoMapIntensity: js.UndefOr[Double] = js.undefined
	var specularMap: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var envMap: js.UndefOr[Texture] = js.undefined
	var combine: js.UndefOr[Combine] = js.undefined
	var reflectivity: js.UndefOr[Double] = js.undefined
	var refractionRatio: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var wireframeLinecap: js.UndefOr[String] = js.undefined
	var wireframeLinejoin: js.UndefOr[String] = js.undefined

@js.native
@JSImport("three","MeshBasicMaterial")
class MeshBasicMaterial extends Material:
	def this(parameters: MeshBasicMaterialParameters) = this()

	var color: Color = js.native
	var map: Texture = js.native
	var lightMap: Texture = js.native
	var lightMapIntensity: Double = js.native
	var aoMap: Texture = js.native
	var aoMapIntensity: Double = js.native
	var specularMap: Texture = js.native
	var alphaMap: Texture = js.native
	var envMap: Texture = js.native
	var combine: Combine = js.native
	var reflectivity: Double = js.native
	var refractionRatio: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var wireframeLinecap: String = js.native
	var wireframeLinejoin: String = js.native



trait MeshLambertMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.undefined
	var emissive: js.UndefOr[ColorRepresentation] = js.undefined
	var emissiveIntensity: js.UndefOr[Double] = js.undefined
	var emissiveMap: js.UndefOr[Texture] = js.undefined
	var map: js.UndefOr[Texture] = js.undefined
	var lightMap: js.UndefOr[Texture] = js.undefined
	var lightMapIntensity: js.UndefOr[Double] = js.undefined
	var aoMap: js.UndefOr[Texture] = js.undefined
	var aoMapIntensity: js.UndefOr[Double] = js.undefined
	var specularMap: js.UndefOr[Texture] = js.undefined
	var alphaMap: js.UndefOr[Texture] = js.undefined
	var envMap: js.UndefOr[Texture] = js.undefined
	var combine: js.UndefOr[Combine] = js.undefined
	var reflectivity: js.UndefOr[Double] = js.undefined
	var refractionRatio: js.UndefOr[Double] = js.undefined
	var wireframe: js.UndefOr[Boolean] = js.undefined
	var wireframeLinewidth: js.UndefOr[Double] = js.undefined
	var wireframeLinecap: js.UndefOr[String] = js.undefined
	var wireframeLinejoin: js.UndefOr[String] = js.undefined

@js.native
@JSImport("three","MeshLambertMaterial")
class MeshLambertMaterial extends Material:
	def this(parameters: MeshLambertMaterialParameters) = this()

	var color: Color = js.native
	var emissive: Color = js.native
	var emissiveIntensity: Double = js.native
	var emissiveMap: Texture = js.native
	var map: Texture = js.native
	var lightMap: Texture = js.native
	var lightMapIntensity: Double = js.native
	var aoMap: Texture = js.native
	var aoMapIntensity: Double = js.native
	var specularMap: Texture = js.native
	var alphaMap: Texture = js.native
	var envMap: Texture = js.native
	var combine: Combine = js.native
	var reflectivity: Double = js.native
	var refractionRatio: Double = js.native
	var wireframe: Boolean = js.native
	var wireframeLinewidth: Double = js.native
	var wireframeLinecap: String = js.native
	var wireframeLinejoin: String = js.native


@js.native
trait AnonObject32 extends js.Object:
	var derivatives: js.UndefOr[Boolean] = js.native
	var fragDepth: js.UndefOr[Boolean] = js.native
	var drawBuffers: js.UndefOr[Boolean] = js.native
	var shaderTextureLOD: js.UndefOr[Boolean] = js.native

@js.native
trait AnonObject31 extends js.Object:
	@JSBracketAccess
	def apply(uniform: String): IUniform[js.Any] = js.native

@js.native
trait AnonObject34 extends js.Object:
	@JSBracketAccess
	def apply(key: String): js.Any = js.native

@js.native
trait AnonObject33 extends js.Object:
	var derivatives: Boolean = js.native
	var fragDepth: Boolean = js.native
	var drawBuffers: Boolean = js.native
	var shaderTextureLOD: Boolean = js.native
