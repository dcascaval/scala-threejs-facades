package typings.three.three.materials

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
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
sealed trait MeshMatcapMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var matcap: js.UndefOr[Texture | Null] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var bumpMap: js.UndefOr[Texture | Null] = js.native;
	var bumpScale: js.UndefOr[Double] = js.native;
	var normalMap: js.UndefOr[Texture | Null] = js.native;
	var normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	var normalScale: js.UndefOr[Vector2] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshMatcapMaterial")
class MeshMatcapMaterial extends Material:
	def this(parameters: js.UndefOr[MeshMatcapMaterialParameters]) = this()


	var color: Color = js.native;
	var matcap: Texture | Null = js.native;
	var map: Texture | Null = js.native;
	var bumpMap: Texture | Null = js.native;
	var bumpScale: Double = js.native;
	var normalMap: Texture | Null = js.native;
	var normalMapType: NormalMapTypes = js.native;
	var normalScale: Vector2 = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var alphaMap: Texture | Null = js.native;
	var flatShading: Boolean = js.native;


@js.native
sealed trait LineDashedMaterialParameters extends LineBasicMaterialParameters:
	var scale: js.UndefOr[Double] = js.native;
	var dashSize: js.UndefOr[Double] = js.native;
	var gapSize: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.LineDashedMaterial")
class LineDashedMaterial extends LineBasicMaterial:
	def this(parameters: js.UndefOr[LineDashedMaterialParameters]) = this()

	var scale: Double = js.native;
	var dashSize: Double = js.native;
	var gapSize: Double = js.native;
	val isLineDashedMaterial: Boolean = js.native;


@js.native
sealed trait MeshToonMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;

	var gradientMap: js.UndefOr[Texture | Null] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var lightMap: js.UndefOr[Texture | Null] = js.native;
	var lightMapIntensity: js.UndefOr[Double] = js.native;
	var aoMap: js.UndefOr[Texture | Null] = js.native;
	var aoMapIntensity: js.UndefOr[Double] = js.native;
	var emissive: js.UndefOr[ColorRepresentation] = js.native;
	var emissiveIntensity: js.UndefOr[Double] = js.native;
	var emissiveMap: js.UndefOr[Texture | Null] = js.native;
	var bumpMap: js.UndefOr[Texture | Null] = js.native;
	var bumpScale: js.UndefOr[Double] = js.native;
	var normalMap: js.UndefOr[Texture | Null] = js.native;
	var normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	var normalScale: js.UndefOr[Vector2] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var wireframeLinecap: js.UndefOr[String] = js.native;
	var wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshToonMaterial")
class MeshToonMaterial extends Material:
	def this(parameters: js.UndefOr[MeshToonMaterialParameters]) = this()


	var color: Color = js.native;
	var gradientMap: Texture | Null = js.native;
	var map: Texture | Null = js.native;
	var lightMap: Texture | Null = js.native;
	var lightMapIntensity: Double = js.native;
	var aoMap: Texture | Null = js.native;
	var aoMapIntensity: Double = js.native;
	var emissive: Color = js.native;
	var emissiveIntensity: Double = js.native;
	var emissiveMap: Texture | Null = js.native;
	var bumpMap: Texture | Null = js.native;
	var bumpScale: Double = js.native;
	var normalMap: Texture | Null = js.native;
	var normalMapType: NormalMapTypes = js.native;
	var normalScale: Vector2 = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var alphaMap: Texture | Null = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var wireframeLinecap: String = js.native;
	var wireframeLinejoin: String = js.native;


@js.native
sealed trait MeshDepthMaterialParameters extends MaterialParameters:
	var map: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var depthPacking: js.UndefOr[DepthPackingStrategies] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.MeshDepthMaterial")
class MeshDepthMaterial extends Material:
	def this(parameters: js.UndefOr[MeshDepthMaterialParameters]) = this()

	var map: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var depthPacking: DepthPackingStrategies = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;



@js.native
@JSGlobal("THREE.RawShaderMaterial")
class RawShaderMaterial extends ShaderMaterial:
	def this(parameters: js.UndefOr[ShaderMaterialParameters]) = this()

@js.native
sealed trait MeshDistanceMaterialParameters extends MaterialParameters:
	var map: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var farDistance: js.UndefOr[Double] = js.native;
	var nearDistance: js.UndefOr[Double] = js.native;
	var referencePosition: js.UndefOr[Vector3] = js.native;

@js.native
@JSGlobal("THREE.MeshDistanceMaterial")
class MeshDistanceMaterial extends Material:
	def this(parameters: js.UndefOr[MeshDistanceMaterialParameters]) = this()

	var map: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var farDistance: Double = js.native;
	var nearDistance: Double = js.native;
	var referencePosition: Vector3 = js.native;



@js.native
sealed trait MaterialParameters extends js.Object:
	var alphaTest: js.UndefOr[Double] = js.native;
	var alphaToCoverage: js.UndefOr[Boolean] = js.native;
	var blendDst: js.UndefOr[BlendingDstFactor] = js.native;
	var blendDstAlpha: js.UndefOr[Double] = js.native;
	var blendEquation: js.UndefOr[BlendingEquation] = js.native;
	var blendEquationAlpha: js.UndefOr[Double] = js.native;
	var blending: js.UndefOr[Blending] = js.native;
	var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.native;
	var blendSrcAlpha: js.UndefOr[Double] = js.native;
	var clipIntersection: js.UndefOr[Boolean] = js.native;
	var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.native;
	var clipShadows: js.UndefOr[Boolean] = js.native;
	var colorWrite: js.UndefOr[Boolean] = js.native;
	var defines: js.UndefOr[js.Any] = js.native;
	var depthFunc: js.UndefOr[DepthModes] = js.native;
	var depthTest: js.UndefOr[Boolean] = js.native;
	var depthWrite: js.UndefOr[Boolean] = js.native;
	var fog: js.UndefOr[Boolean] = js.native;
	var name: js.UndefOr[String] = js.native;
	var opacity: js.UndefOr[Double] = js.native;
	var polygonOffset: js.UndefOr[Boolean] = js.native;
	var polygonOffsetFactor: js.UndefOr[Double] = js.native;
	var polygonOffsetUnits: js.UndefOr[Double] = js.native;
	var precision: js.UndefOr["highp" | "mediump" | "lowp" | Null] = js.native;
	var premultipliedAlpha: js.UndefOr[Boolean] = js.native;
	var dithering: js.UndefOr[Boolean] = js.native;
	var side: js.UndefOr[Side] = js.native;
	var shadowSide: js.UndefOr[Side] = js.native;
	var toneMapped: js.UndefOr[Boolean] = js.native;
	var transparent: js.UndefOr[Boolean] = js.native;
	var vertexColors: js.UndefOr[Boolean] = js.native;
	var visible: js.UndefOr[Boolean] = js.native;
	var stencilWrite: js.UndefOr[Boolean] = js.native;
	var stencilFunc: js.UndefOr[StencilFunc] = js.native;
	var stencilRef: js.UndefOr[Double] = js.native;
	var stencilWriteMask: js.UndefOr[Double] = js.native;
	var stencilFuncMask: js.UndefOr[Double] = js.native;
	var stencilFail: js.UndefOr[StencilOp] = js.native;
	var stencilZFail: js.UndefOr[StencilOp] = js.native;
	var stencilZPass: js.UndefOr[StencilOp] = js.native;
	var userData: js.UndefOr[js.Any] = js.native;

@js.native
@JSGlobal("THREE.Material")
class Material extends EventDispatcher:
	var alphaTest: Double = js.native;
	var alphaToCoverage: Boolean = js.native;
	var blendDst: BlendingDstFactor = js.native;
	var blendDstAlpha: Double | Null = js.native;
	var blendEquation: BlendingEquation = js.native;
	var blendEquationAlpha: Double | Null = js.native;
	var blending: Blending = js.native;
	var blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native;
	var blendSrcAlpha: Double | Null = js.native;
	var clipIntersection: Boolean = js.native;
	var clippingPlanes: js.Any = js.native;
	var clipShadows: Boolean = js.native;
	var colorWrite: Boolean = js.native;
	var defines: js.UndefOr[objectType31] = js.native;
	var depthFunc: DepthModes = js.native;
	var depthTest: Boolean = js.native;
	var depthWrite: Boolean = js.native;
	var fog: Boolean = js.native;
	var id: Double = js.native;
	var stencilWrite: Boolean = js.native;
	var stencilFunc: StencilFunc = js.native;
	var stencilRef: Double = js.native;
	var stencilWriteMask: Double = js.native;
	var stencilFuncMask: Double = js.native;
	var stencilFail: StencilOp = js.native;
	var stencilZFail: StencilOp = js.native;
	var stencilZPass: StencilOp = js.native;
	val isMaterial: Boolean = js.native;
	var name: String = js.native;
	var needsUpdate: Boolean = js.native;
	var opacity: Double = js.native;
	var polygonOffset: Boolean = js.native;
	var polygonOffsetFactor: Double = js.native;
	var polygonOffsetUnits: Double = js.native;
	var precision: "highp" | "mediump" | "lowp" | Null = js.native;
	var premultipliedAlpha: Boolean = js.native;
	var dithering: Boolean = js.native;
	var side: Side = js.native;
	var shadowSide: Side = js.native;
	var toneMapped: Boolean = js.native;
	var transparent: Boolean = js.native;
	var `type`: String = js.native;
	var uuid: String = js.native;
	var vertexColors: Boolean = js.native;
	var visible: Boolean = js.native;
	var userData: js.Any = js.native;
	var version: Double = js.native;
	@JSName("clone")
	def jsClone(): this.type = js.native
	def copy(material: Material): this.type = js.native
	def dispose(): Unit = js.native
	def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
	def customProgramCacheKey(): String = js.native
	def setValues(values: MaterialParameters): Unit = js.native
	def toJSON(meta: js.UndefOr[js.Any]): js.Any = js.native

@js.native
sealed trait ShadowMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;

@js.native
@JSGlobal("THREE.ShadowMaterial")
class ShadowMaterial extends Material:
	def this(parameters: js.UndefOr[ShadowMaterialParameters]) = this()

	var color: Color = js.native;


@js.native
sealed trait ShaderMaterialParameters extends MaterialParameters:
	var uniforms: js.UndefOr[objectType32] = js.native;
	var vertexShader: js.UndefOr[String] = js.native;
	var fragmentShader: js.UndefOr[String] = js.native;
	var linewidth: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var lights: js.UndefOr[Boolean] = js.native;
	var clipping: js.UndefOr[Boolean] = js.native;
	var extensions: js.UndefOr[objectType33] = js.native;
	var glslVersion: js.UndefOr[GLSLVersion] = js.native;

@js.native
@JSGlobal("THREE.ShaderMaterial")
class ShaderMaterial extends Material:
	def this(parameters: js.UndefOr[ShaderMaterialParameters]) = this()


	var uniforms: objectType32 = js.native;
	var vertexShader: String = js.native;
	var fragmentShader: String = js.native;
	var linewidth: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;

	var lights: Boolean = js.native;
	var clipping: Boolean = js.native;
	var derivatives: js.Any = js.native;
	var extensions: objectType34 = js.native;
	var defaultAttributeValues: js.Any = js.native;
	var index0AttributeName: js.UndefOr[String] = js.native;
	var uniformsNeedUpdate: Boolean = js.native;
	var glslVersion: GLSLVersion | Null = js.native;
	var isShaderMaterial: Boolean = js.native;



@js.native
sealed trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters:
	var clearcoat: js.UndefOr[Double] = js.native;
	var clearcoatMap: js.UndefOr[Texture | Null] = js.native;
	var clearcoatRoughness: js.UndefOr[Double] = js.native;
	var clearcoatRoughnessMap: js.UndefOr[Texture | Null] = js.native;
	var clearcoatNormalScale: js.UndefOr[Vector2] = js.native;
	var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.native;
	var reflectivity: js.UndefOr[Double] = js.native;
	var ior: js.UndefOr[Double] = js.native;
	var sheen: js.UndefOr[Color] = js.native;
	var transmission: js.UndefOr[Double] = js.native;
	var transmissionMap: js.UndefOr[Texture | Null] = js.native;
	var attenuationDistance: js.UndefOr[Double] = js.native;
	var attenuationTint: js.UndefOr[Color] = js.native;
	var specularIntensity: js.UndefOr[Double] = js.native;
	var specularTint: js.UndefOr[Color] = js.native;
	var specularIntensityMap: js.UndefOr[Texture | Null] = js.native;
	var specularTintMap: js.UndefOr[Texture | Null] = js.native;

@js.native
@JSGlobal("THREE.MeshPhysicalMaterial")
class MeshPhysicalMaterial extends MeshStandardMaterial:
	def this(parameters: js.UndefOr[MeshPhysicalMaterialParameters]) = this()


	var clearcoat: Double = js.native;
	var clearcoatMap: Texture | Null = js.native;
	var clearcoatRoughness: Double = js.native;
	var clearcoatRoughnessMap: Texture | Null = js.native;
	var clearcoatNormalScale: Vector2 = js.native;
	var clearcoatNormalMap: Texture | Null = js.native;
	var reflectivity: Double = js.native;
	var ior: Double = js.native;
	var sheen: Color | Null = js.native;
	var transmission: Double = js.native;
	var transmissionMap: Texture | Null = js.native;
	var thickness: Double = js.native;
	var thicknessMap: Texture | Null = js.native;
	var attenuationDistance: Double = js.native;
	var attenuationColor: Color = js.native;
	var specularIntensity: Double = js.native;
	var specularTint: Color = js.native;
	var specularIntensityMap: Texture | Null = js.native;
	var specularTintMap: Texture | Null = js.native;

@js.native
sealed trait MeshLambertMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var emissive: js.UndefOr[ColorRepresentation] = js.native;
	var emissiveIntensity: js.UndefOr[Double] = js.native;
	var emissiveMap: js.UndefOr[Texture | Null] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var lightMap: js.UndefOr[Texture | Null] = js.native;
	var lightMapIntensity: js.UndefOr[Double] = js.native;
	var aoMap: js.UndefOr[Texture | Null] = js.native;
	var aoMapIntensity: js.UndefOr[Double] = js.native;
	var specularMap: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var envMap: js.UndefOr[Texture | Null] = js.native;
	var combine: js.UndefOr[Combine] = js.native;
	var reflectivity: js.UndefOr[Double] = js.native;
	var refractionRatio: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var wireframeLinecap: js.UndefOr[String] = js.native;
	var wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshLambertMaterial")
class MeshLambertMaterial extends Material:
	def this(parameters: js.UndefOr[MeshLambertMaterialParameters]) = this()

	var color: Color = js.native;
	var emissive: Color = js.native;
	var emissiveIntensity: Double = js.native;
	var emissiveMap: Texture | Null = js.native;
	var map: Texture | Null = js.native;
	var lightMap: Texture | Null = js.native;
	var lightMapIntensity: Double = js.native;
	var aoMap: Texture | Null = js.native;
	var aoMapIntensity: Double = js.native;
	var specularMap: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var envMap: Texture | Null = js.native;
	var combine: Combine = js.native;
	var reflectivity: Double = js.native;
	var refractionRatio: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var wireframeLinecap: String = js.native;
	var wireframeLinejoin: String = js.native;


@js.native
sealed trait SpriteMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var rotation: js.UndefOr[Double] = js.native;
	var sizeAttenuation: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.SpriteMaterial")
class SpriteMaterial extends Material:
	def this(parameters: js.UndefOr[SpriteMaterialParameters]) = this()

	var color: Color = js.native;
	var map: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var rotation: Double = js.native;
	var sizeAttenuation: Boolean = js.native;

	val isSpriteMaterial: Boolean = js.native;



@js.native
sealed trait MeshBasicMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;

	var map: js.UndefOr[Texture | Null] = js.native;
	var lightMap: js.UndefOr[Texture | Null] = js.native;
	var lightMapIntensity: js.UndefOr[Double] = js.native;
	var aoMap: js.UndefOr[Texture | Null] = js.native;
	var aoMapIntensity: js.UndefOr[Double] = js.native;
	var specularMap: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var envMap: js.UndefOr[Texture | Null] = js.native;
	var combine: js.UndefOr[Combine] = js.native;
	var reflectivity: js.UndefOr[Double] = js.native;
	var refractionRatio: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var wireframeLinecap: js.UndefOr[String] = js.native;
	var wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshBasicMaterial")
class MeshBasicMaterial extends Material:
	def this(parameters: js.UndefOr[MeshBasicMaterialParameters]) = this()

	var color: Color = js.native;
	var map: Texture | Null = js.native;
	var lightMap: Texture | Null = js.native;
	var lightMapIntensity: Double = js.native;
	var aoMap: Texture | Null = js.native;
	var aoMapIntensity: Double = js.native;
	var specularMap: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var envMap: Texture | Null = js.native;
	var combine: Combine = js.native;
	var reflectivity: Double = js.native;
	var refractionRatio: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var wireframeLinecap: String = js.native;
	var wireframeLinejoin: String = js.native;


@js.native
sealed trait MeshNormalMaterialParameters extends MaterialParameters:
	var bumpMap: js.UndefOr[Texture | Null] = js.native;
	var bumpScale: js.UndefOr[Double] = js.native;
	var normalMap: js.UndefOr[Texture | Null] = js.native;
	var normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	var normalScale: js.UndefOr[Vector2] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshNormalMaterial")
class MeshNormalMaterial extends Material:
	def this(parameters: js.UndefOr[MeshNormalMaterialParameters]) = this()

	var bumpMap: Texture | Null = js.native;
	var bumpScale: Double = js.native;
	var normalMap: Texture | Null = js.native;
	var normalMapType: NormalMapTypes = js.native;
	var normalScale: Vector2 = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var flatShading: Boolean = js.native;


@js.native
sealed trait LineBasicMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var linewidth: js.UndefOr[Double] = js.native;
	var linecap: js.UndefOr[String] = js.native;
	var linejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.LineBasicMaterial")
class LineBasicMaterial extends Material:
	def this(parameters: js.UndefOr[LineBasicMaterialParameters]) = this()

	var color: Color = js.native;
	var linewidth: Double = js.native;
	var linecap: String = js.native;
	var linejoin: String = js.native;


@js.native
sealed trait PointsMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var size: js.UndefOr[Double] = js.native;
	var sizeAttenuation: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.PointsMaterial")
class PointsMaterial extends Material:
	def this(parameters: js.UndefOr[PointsMaterialParameters]) = this()

	var color: Color = js.native;
	var map: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var size: Double = js.native;
	var sizeAttenuation: Boolean = js.native;


@js.native
sealed trait MeshPhongMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var specular: js.UndefOr[ColorRepresentation] = js.native;
	var shininess: js.UndefOr[Double] = js.native;

	var map: js.UndefOr[Texture | Null] = js.native;
	var lightMap: js.UndefOr[Texture | Null] = js.native;
	var lightMapIntensity: js.UndefOr[Double] = js.native;
	var aoMap: js.UndefOr[Texture | Null] = js.native;
	var aoMapIntensity: js.UndefOr[Double] = js.native;
	var emissive: js.UndefOr[ColorRepresentation] = js.native;
	var emissiveIntensity: js.UndefOr[Double] = js.native;
	var emissiveMap: js.UndefOr[Texture | Null] = js.native;
	var bumpMap: js.UndefOr[Texture | Null] = js.native;
	var bumpScale: js.UndefOr[Double] = js.native;
	var normalMap: js.UndefOr[Texture | Null] = js.native;
	var normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	var normalScale: js.UndefOr[Vector2] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var specularMap: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var envMap: js.UndefOr[Texture | Null] = js.native;
	var combine: js.UndefOr[Combine] = js.native;
	var reflectivity: js.UndefOr[Double] = js.native;
	var refractionRatio: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var wireframeLinecap: js.UndefOr[String] = js.native;
	var wireframeLinejoin: js.UndefOr[String] = js.native;
	var flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshPhongMaterial")
class MeshPhongMaterial extends Material:
	def this(parameters: js.UndefOr[MeshPhongMaterialParameters]) = this()

	var color: Color = js.native;
	var specular: Color = js.native;
	var shininess: Double = js.native;
	var map: Texture | Null = js.native;
	var lightMap: Texture | Null = js.native;
	var lightMapIntensity: Double = js.native;
	var aoMap: Texture | Null = js.native;
	var aoMapIntensity: Double = js.native;
	var emissive: Color = js.native;
	var emissiveIntensity: Double = js.native;
	var emissiveMap: Texture | Null = js.native;
	var bumpMap: Texture | Null = js.native;
	var bumpScale: Double = js.native;
	var normalMap: Texture | Null = js.native;
	var normalMapType: NormalMapTypes = js.native;
	var normalScale: Vector2 = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var specularMap: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var envMap: Texture | Null = js.native;
	var combine: Combine = js.native;
	var reflectivity: Double = js.native;
	var refractionRatio: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var wireframeLinecap: String = js.native;
	var wireframeLinejoin: String = js.native;
	var flatShading: Boolean = js.native;
	var metal: Boolean = js.native;


@js.native
sealed trait MeshStandardMaterialParameters extends MaterialParameters:
	var color: js.UndefOr[ColorRepresentation] = js.native;
	var roughness: js.UndefOr[Double] = js.native;
	var metalness: js.UndefOr[Double] = js.native;
	var map: js.UndefOr[Texture | Null] = js.native;
	var lightMap: js.UndefOr[Texture | Null] = js.native;
	var lightMapIntensity: js.UndefOr[Double] = js.native;
	var aoMap: js.UndefOr[Texture | Null] = js.native;
	var aoMapIntensity: js.UndefOr[Double] = js.native;
	var emissive: js.UndefOr[ColorRepresentation] = js.native;
	var emissiveIntensity: js.UndefOr[Double] = js.native;
	var emissiveMap: js.UndefOr[Texture | Null] = js.native;
	var bumpMap: js.UndefOr[Texture | Null] = js.native;
	var bumpScale: js.UndefOr[Double] = js.native;
	var normalMap: js.UndefOr[Texture | Null] = js.native;
	var normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	var normalScale: js.UndefOr[Vector2] = js.native;
	var displacementMap: js.UndefOr[Texture | Null] = js.native;
	var displacementScale: js.UndefOr[Double] = js.native;
	var displacementBias: js.UndefOr[Double] = js.native;
	var roughnessMap: js.UndefOr[Texture | Null] = js.native;
	var metalnessMap: js.UndefOr[Texture | Null] = js.native;
	var alphaMap: js.UndefOr[Texture | Null] = js.native;
	var envMap: js.UndefOr[Texture | Null] = js.native;
	var envMapIntensity: js.UndefOr[Double] = js.native;
	var refractionRatio: js.UndefOr[Double] = js.native;
	var wireframe: js.UndefOr[Boolean] = js.native;
	var wireframeLinewidth: js.UndefOr[Double] = js.native;
	var flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshStandardMaterial")
class MeshStandardMaterial extends Material:
	def this(parameters: js.UndefOr[MeshStandardMaterialParameters]) = this()


	var color: Color = js.native;
	var roughness: Double = js.native;
	var metalness: Double = js.native;
	var map: Texture | Null = js.native;
	var lightMap: Texture | Null = js.native;
	var lightMapIntensity: Double = js.native;
	var aoMap: Texture | Null = js.native;
	var aoMapIntensity: Double = js.native;
	var emissive: Color = js.native;
	var emissiveIntensity: Double = js.native;
	var emissiveMap: Texture | Null = js.native;
	var bumpMap: Texture | Null = js.native;
	var bumpScale: Double = js.native;
	var normalMap: Texture | Null = js.native;
	var normalMapType: NormalMapTypes = js.native;
	var normalScale: Vector2 = js.native;
	var displacementMap: Texture | Null = js.native;
	var displacementScale: Double = js.native;
	var displacementBias: Double = js.native;
	var roughnessMap: Texture | Null = js.native;
	var metalnessMap: Texture | Null = js.native;
	var alphaMap: Texture | Null = js.native;
	var envMap: Texture | Null = js.native;
	var envMapIntensity: Double = js.native;
	var refractionRatio: Double = js.native;
	var wireframe: Boolean = js.native;
	var wireframeLinewidth: Double = js.native;
	var wireframeLinecap: String = js.native;
	var wireframeLinejoin: String = js.native;
	var flatShading: Boolean = js.native;
	var isMeshStandardMaterial: Boolean = js.native;


@js.native
sealed trait objectType33 extends js.Object:
	var derivatives: js.UndefOr[Boolean] = js.native;
	var fragDepth: js.UndefOr[Boolean] = js.native;
	var drawBuffers: js.UndefOr[Boolean] = js.native;
	var shaderTextureLOD: js.UndefOr[Boolean] = js.native;

@js.native
sealed trait objectType32 extends js.Object:
	@JSBracketAccess
	def apply(uniform: String): IUniform[js.Any] = js.native

@js.native
sealed trait objectType31 extends js.Object:
	@JSBracketAccess
	def apply(key: String): js.Any = js.native

@js.native
sealed trait objectType34 extends js.Object:
	var derivatives: Boolean = js.native;
	var fragDepth: Boolean = js.native;
	var drawBuffers: Boolean = js.native;
	var shaderTextureLOD: Boolean = js.native;
