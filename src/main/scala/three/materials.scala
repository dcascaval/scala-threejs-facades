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
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val matcap: js.UndefOr[Texture | Null] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val bumpMap: js.UndefOr[Texture | Null] = js.native;
	val bumpScale: js.UndefOr[Double] = js.native;
	val normalMap: js.UndefOr[Texture | Null] = js.native;
	val normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	val normalScale: js.UndefOr[Vector2] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshMatcapMaterial")
class MeshMatcapMaterial extends Material:
	def this(parameters: js.UndefOr[MeshMatcapMaterialParameters]) = this()
	val `type`: String = js.native;
	val defines: objectType33 = js.native;
	val color: Color = js.native;
	val matcap: Texture | Null = js.native;
	val map: Texture | Null = js.native;
	val bumpMap: Texture | Null = js.native;
	val bumpScale: Double = js.native;
	val normalMap: Texture | Null = js.native;
	val normalMapType: NormalMapTypes = js.native;
	val normalScale: Vector2 = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val alphaMap: Texture | Null = js.native;
	val flatShading: Boolean = js.native;
	def setValues(parameters: MeshMatcapMaterialParameters): Unit = js.native

@js.native
sealed trait LineDashedMaterialParameters extends LineBasicMaterialParameters:
	val scale: js.UndefOr[Double] = js.native;
	val dashSize: js.UndefOr[Double] = js.native;
	val gapSize: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.LineDashedMaterial")
class LineDashedMaterial extends LineBasicMaterial:
	def this(parameters: js.UndefOr[LineDashedMaterialParameters]) = this()
	val `type`: String = js.native;
	val scale: Double = js.native;
	val dashSize: Double = js.native;
	val gapSize: Double = js.native;
	var isLineDashedMaterial: Boolean = js.native;
	def setValues(parameters: LineDashedMaterialParameters): Unit = js.native

@js.native
sealed trait MeshToonMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val opacity: js.UndefOr[Double] = js.native;
	val gradientMap: js.UndefOr[Texture | Null] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val lightMap: js.UndefOr[Texture | Null] = js.native;
	val lightMapIntensity: js.UndefOr[Double] = js.native;
	val aoMap: js.UndefOr[Texture | Null] = js.native;
	val aoMapIntensity: js.UndefOr[Double] = js.native;
	val emissive: js.UndefOr[ColorRepresentation] = js.native;
	val emissiveIntensity: js.UndefOr[Double] = js.native;
	val emissiveMap: js.UndefOr[Texture | Null] = js.native;
	val bumpMap: js.UndefOr[Texture | Null] = js.native;
	val bumpScale: js.UndefOr[Double] = js.native;
	val normalMap: js.UndefOr[Texture | Null] = js.native;
	val normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	val normalScale: js.UndefOr[Vector2] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val wireframeLinecap: js.UndefOr[String] = js.native;
	val wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshToonMaterial")
class MeshToonMaterial extends Material:
	def this(parameters: js.UndefOr[MeshToonMaterialParameters]) = this()
	val `type`: String = js.native;
	val defines: objectType33 = js.native;
	val color: Color = js.native;
	val gradientMap: Texture | Null = js.native;
	val map: Texture | Null = js.native;
	val lightMap: Texture | Null = js.native;
	val lightMapIntensity: Double = js.native;
	val aoMap: Texture | Null = js.native;
	val aoMapIntensity: Double = js.native;
	val emissive: Color = js.native;
	val emissiveIntensity: Double = js.native;
	val emissiveMap: Texture | Null = js.native;
	val bumpMap: Texture | Null = js.native;
	val bumpScale: Double = js.native;
	val normalMap: Texture | Null = js.native;
	val normalMapType: NormalMapTypes = js.native;
	val normalScale: Vector2 = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val alphaMap: Texture | Null = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val wireframeLinecap: String = js.native;
	val wireframeLinejoin: String = js.native;
	def setValues(parameters: MeshToonMaterialParameters): Unit = js.native

@js.native
sealed trait MeshDepthMaterialParameters extends MaterialParameters:
	val map: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val depthPacking: js.UndefOr[DepthPackingStrategies] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.MeshDepthMaterial")
class MeshDepthMaterial extends Material:
	def this(parameters: js.UndefOr[MeshDepthMaterialParameters]) = this()
	val `type`: String = js.native;
	val map: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val depthPacking: DepthPackingStrategies = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val fog: Boolean = js.native;
	def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native

@js.native
@JSGlobal("THREE.RawShaderMaterial")
class RawShaderMaterial extends ShaderMaterial:
	def this(parameters: js.UndefOr[ShaderMaterialParameters]) = this()

@js.native
sealed trait MeshDistanceMaterialParameters extends MaterialParameters:
	val map: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val farDistance: js.UndefOr[Double] = js.native;
	val nearDistance: js.UndefOr[Double] = js.native;
	val referencePosition: js.UndefOr[Vector3] = js.native;

@js.native
@JSGlobal("THREE.MeshDistanceMaterial")
class MeshDistanceMaterial extends Material:
	def this(parameters: js.UndefOr[MeshDistanceMaterialParameters]) = this()
	val `type`: String = js.native;
	val map: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val farDistance: Double = js.native;
	val nearDistance: Double = js.native;
	val referencePosition: Vector3 = js.native;
	val fog: Boolean = js.native;
	def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native

@js.native
sealed trait MaterialParameters extends js.Object:
	val alphaTest: js.UndefOr[Double] = js.native;
	val alphaToCoverage: js.UndefOr[Boolean] = js.native;
	val blendDst: js.UndefOr[BlendingDstFactor] = js.native;
	val blendDstAlpha: js.UndefOr[Double] = js.native;
	val blendEquation: js.UndefOr[BlendingEquation] = js.native;
	val blendEquationAlpha: js.UndefOr[Double] = js.native;
	val blending: js.UndefOr[Blending] = js.native;
	val blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.native;
	val blendSrcAlpha: js.UndefOr[Double] = js.native;
	val clipIntersection: js.UndefOr[Boolean] = js.native;
	val clippingPlanes: js.UndefOr[js.Array[Plane]] = js.native;
	val clipShadows: js.UndefOr[Boolean] = js.native;
	val colorWrite: js.UndefOr[Boolean] = js.native;
	val defines: js.UndefOr[js.Any] = js.native;
	val depthFunc: js.UndefOr[DepthModes] = js.native;
	val depthTest: js.UndefOr[Boolean] = js.native;
	val depthWrite: js.UndefOr[Boolean] = js.native;
	val fog: js.UndefOr[Boolean] = js.native;
	val name: js.UndefOr[String] = js.native;
	val opacity: js.UndefOr[Double] = js.native;
	val polygonOffset: js.UndefOr[Boolean] = js.native;
	val polygonOffsetFactor: js.UndefOr[Double] = js.native;
	val polygonOffsetUnits: js.UndefOr[Double] = js.native;
	val precision: js.UndefOr["highp" | "mediump" | "lowp" | Null] = js.native;
	val premultipliedAlpha: js.UndefOr[Boolean] = js.native;
	val dithering: js.UndefOr[Boolean] = js.native;
	val side: js.UndefOr[Side] = js.native;
	val shadowSide: js.UndefOr[Side] = js.native;
	val toneMapped: js.UndefOr[Boolean] = js.native;
	val transparent: js.UndefOr[Boolean] = js.native;
	val vertexColors: js.UndefOr[Boolean] = js.native;
	val visible: js.UndefOr[Boolean] = js.native;
	val stencilWrite: js.UndefOr[Boolean] = js.native;
	val stencilFunc: js.UndefOr[StencilFunc] = js.native;
	val stencilRef: js.UndefOr[Double] = js.native;
	val stencilWriteMask: js.UndefOr[Double] = js.native;
	val stencilFuncMask: js.UndefOr[Double] = js.native;
	val stencilFail: js.UndefOr[StencilOp] = js.native;
	val stencilZFail: js.UndefOr[StencilOp] = js.native;
	val stencilZPass: js.UndefOr[StencilOp] = js.native;
	val userData: js.UndefOr[js.Any] = js.native;

@js.native
@JSGlobal("THREE.Material")
class Material extends EventDispatcher:
	val alphaTest: Double = js.native;
	val alphaToCoverage: Boolean = js.native;
	val blendDst: BlendingDstFactor = js.native;
	val blendDstAlpha: Double | Null = js.native;
	val blendEquation: BlendingEquation = js.native;
	val blendEquationAlpha: Double | Null = js.native;
	val blending: Blending = js.native;
	val blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native;
	val blendSrcAlpha: Double | Null = js.native;
	val clipIntersection: Boolean = js.native;
	val clippingPlanes: js.Any = js.native;
	val clipShadows: Boolean = js.native;
	val colorWrite: Boolean = js.native;
	val defines: js.UndefOr[objectType33] = js.native;
	val depthFunc: DepthModes = js.native;
	val depthTest: Boolean = js.native;
	val depthWrite: Boolean = js.native;
	val fog: Boolean = js.native;
	val id: Double = js.native;
	val stencilWrite: Boolean = js.native;
	val stencilFunc: StencilFunc = js.native;
	val stencilRef: Double = js.native;
	val stencilWriteMask: Double = js.native;
	val stencilFuncMask: Double = js.native;
	val stencilFail: StencilOp = js.native;
	val stencilZFail: StencilOp = js.native;
	val stencilZPass: StencilOp = js.native;
	var isMaterial: Boolean = js.native;
	val name: String = js.native;
	val needsUpdate: Boolean = js.native;
	val opacity: Double = js.native;
	val polygonOffset: Boolean = js.native;
	val polygonOffsetFactor: Double = js.native;
	val polygonOffsetUnits: Double = js.native;
	val precision: "highp" | "mediump" | "lowp" | Null = js.native;
	val premultipliedAlpha: Boolean = js.native;
	val dithering: Boolean = js.native;
	val side: Side = js.native;
	val shadowSide: Side = js.native;
	val toneMapped: Boolean = js.native;
	val transparent: Boolean = js.native;
	val `type`: String = js.native;
	val uuid: String = js.native;
	val vertexColors: Boolean = js.native;
	val visible: Boolean = js.native;
	val userData: js.Any = js.native;
	val version: Double = js.native;
	def clone(): this.type = js.native
	def copy(material: Material): this.type = js.native
	def dispose(): Unit = js.native
	def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
	def customProgramCacheKey(): String = js.native
	def setValues(values: MaterialParameters): Unit = js.native
	def toJSON(meta: js.UndefOr[js.Any]): js.Any = js.native

@js.native
sealed trait ShadowMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;

@js.native
@JSGlobal("THREE.ShadowMaterial")
class ShadowMaterial extends Material:
	def this(parameters: js.UndefOr[ShadowMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val transparent: Boolean = js.native;

@js.native
sealed trait ShaderMaterialParameters extends MaterialParameters:
	val uniforms: js.UndefOr[objectType34] = js.native;
	val vertexShader: js.UndefOr[String] = js.native;
	val fragmentShader: js.UndefOr[String] = js.native;
	val linewidth: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val lights: js.UndefOr[Boolean] = js.native;
	val clipping: js.UndefOr[Boolean] = js.native;
	val extensions: js.UndefOr[objectType35] = js.native;
	val glslVersion: js.UndefOr[GLSLVersion] = js.native;

@js.native
@JSGlobal("THREE.ShaderMaterial")
class ShaderMaterial extends Material:
	def this(parameters: js.UndefOr[ShaderMaterialParameters]) = this()
	val `type`: String = js.native;
	val defines: objectType33 = js.native;
	val uniforms: objectType34 = js.native;
	val vertexShader: String = js.native;
	val fragmentShader: String = js.native;
	val linewidth: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val fog: Boolean = js.native;
	val lights: Boolean = js.native;
	val clipping: Boolean = js.native;
	val derivatives: js.Any = js.native;
	val extensions: objectType36 = js.native;
	val defaultAttributeValues: js.Any = js.native;
	val index0AttributeName: js.UndefOr[String] = js.native;
	val uniformsNeedUpdate: Boolean = js.native;
	val glslVersion: GLSLVersion | Null = js.native;
	val isShaderMaterial: Boolean = js.native;
	def setValues(parameters: ShaderMaterialParameters): Unit = js.native
	def toJSON(meta: js.Any): js.Any = js.native

@js.native
sealed trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters:
	val clearcoat: js.UndefOr[Double] = js.native;
	val clearcoatMap: js.UndefOr[Texture | Null] = js.native;
	val clearcoatRoughness: js.UndefOr[Double] = js.native;
	val clearcoatRoughnessMap: js.UndefOr[Texture | Null] = js.native;
	val clearcoatNormalScale: js.UndefOr[Vector2] = js.native;
	val clearcoatNormalMap: js.UndefOr[Texture | Null] = js.native;
	val reflectivity: js.UndefOr[Double] = js.native;
	val ior: js.UndefOr[Double] = js.native;
	val sheen: js.UndefOr[Color] = js.native;
	val transmission: js.UndefOr[Double] = js.native;
	val transmissionMap: js.UndefOr[Texture | Null] = js.native;
	val attenuationDistance: js.UndefOr[Double] = js.native;
	val attenuationTint: js.UndefOr[Color] = js.native;
	val specularIntensity: js.UndefOr[Double] = js.native;
	val specularTint: js.UndefOr[Color] = js.native;
	val specularIntensityMap: js.UndefOr[Texture | Null] = js.native;
	val specularTintMap: js.UndefOr[Texture | Null] = js.native;

@js.native
@JSGlobal("THREE.MeshPhysicalMaterial")
class MeshPhysicalMaterial extends MeshStandardMaterial:
	def this(parameters: js.UndefOr[MeshPhysicalMaterialParameters]) = this()
	val `type`: String = js.native;
	val defines: objectType33 = js.native;
	val clearcoat: Double = js.native;
	val clearcoatMap: Texture | Null = js.native;
	val clearcoatRoughness: Double = js.native;
	val clearcoatRoughnessMap: Texture | Null = js.native;
	val clearcoatNormalScale: Vector2 = js.native;
	val clearcoatNormalMap: Texture | Null = js.native;
	val reflectivity: Double = js.native;
	val ior: Double = js.native;
	val sheen: Color | Null = js.native;
	val transmission: Double = js.native;
	val transmissionMap: Texture | Null = js.native;
	val thickness: Double = js.native;
	val thicknessMap: Texture | Null = js.native;
	val attenuationDistance: Double = js.native;
	val attenuationColor: Color = js.native;
	val specularIntensity: Double = js.native;
	val specularTint: Color = js.native;
	val specularIntensityMap: Texture | Null = js.native;
	val specularTintMap: Texture | Null = js.native;

@js.native
sealed trait MeshLambertMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val emissive: js.UndefOr[ColorRepresentation] = js.native;
	val emissiveIntensity: js.UndefOr[Double] = js.native;
	val emissiveMap: js.UndefOr[Texture | Null] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val lightMap: js.UndefOr[Texture | Null] = js.native;
	val lightMapIntensity: js.UndefOr[Double] = js.native;
	val aoMap: js.UndefOr[Texture | Null] = js.native;
	val aoMapIntensity: js.UndefOr[Double] = js.native;
	val specularMap: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val envMap: js.UndefOr[Texture | Null] = js.native;
	val combine: js.UndefOr[Combine] = js.native;
	val reflectivity: js.UndefOr[Double] = js.native;
	val refractionRatio: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val wireframeLinecap: js.UndefOr[String] = js.native;
	val wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshLambertMaterial")
class MeshLambertMaterial extends Material:
	def this(parameters: js.UndefOr[MeshLambertMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val emissive: Color = js.native;
	val emissiveIntensity: Double = js.native;
	val emissiveMap: Texture | Null = js.native;
	val map: Texture | Null = js.native;
	val lightMap: Texture | Null = js.native;
	val lightMapIntensity: Double = js.native;
	val aoMap: Texture | Null = js.native;
	val aoMapIntensity: Double = js.native;
	val specularMap: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val envMap: Texture | Null = js.native;
	val combine: Combine = js.native;
	val reflectivity: Double = js.native;
	val refractionRatio: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val wireframeLinecap: String = js.native;
	val wireframeLinejoin: String = js.native;
	def setValues(parameters: MeshLambertMaterialParameters): Unit = js.native

@js.native
sealed trait SpriteMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val rotation: js.UndefOr[Double] = js.native;
	val sizeAttenuation: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.SpriteMaterial")
class SpriteMaterial extends Material:
	def this(parameters: js.UndefOr[SpriteMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val map: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val rotation: Double = js.native;
	val sizeAttenuation: Boolean = js.native;
	val transparent: Boolean = js.native;
	var isSpriteMaterial: Boolean = js.native;
	def setValues(parameters: SpriteMaterialParameters): Unit = js.native
	def copy(source: SpriteMaterial): this.type = js.native

@js.native
sealed trait MeshBasicMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val opacity: js.UndefOr[Double] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val lightMap: js.UndefOr[Texture | Null] = js.native;
	val lightMapIntensity: js.UndefOr[Double] = js.native;
	val aoMap: js.UndefOr[Texture | Null] = js.native;
	val aoMapIntensity: js.UndefOr[Double] = js.native;
	val specularMap: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val envMap: js.UndefOr[Texture | Null] = js.native;
	val combine: js.UndefOr[Combine] = js.native;
	val reflectivity: js.UndefOr[Double] = js.native;
	val refractionRatio: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val wireframeLinecap: js.UndefOr[String] = js.native;
	val wireframeLinejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.MeshBasicMaterial")
class MeshBasicMaterial extends Material:
	def this(parameters: js.UndefOr[MeshBasicMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val map: Texture | Null = js.native;
	val lightMap: Texture | Null = js.native;
	val lightMapIntensity: Double = js.native;
	val aoMap: Texture | Null = js.native;
	val aoMapIntensity: Double = js.native;
	val specularMap: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val envMap: Texture | Null = js.native;
	val combine: Combine = js.native;
	val reflectivity: Double = js.native;
	val refractionRatio: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val wireframeLinecap: String = js.native;
	val wireframeLinejoin: String = js.native;
	def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native

@js.native
sealed trait MeshNormalMaterialParameters extends MaterialParameters:
	val bumpMap: js.UndefOr[Texture | Null] = js.native;
	val bumpScale: js.UndefOr[Double] = js.native;
	val normalMap: js.UndefOr[Texture | Null] = js.native;
	val normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	val normalScale: js.UndefOr[Vector2] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshNormalMaterial")
class MeshNormalMaterial extends Material:
	def this(parameters: js.UndefOr[MeshNormalMaterialParameters]) = this()
	val `type`: String = js.native;
	val bumpMap: Texture | Null = js.native;
	val bumpScale: Double = js.native;
	val normalMap: Texture | Null = js.native;
	val normalMapType: NormalMapTypes = js.native;
	val normalScale: Vector2 = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val flatShading: Boolean = js.native;
	def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native

@js.native
sealed trait LineBasicMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val linewidth: js.UndefOr[Double] = js.native;
	val linecap: js.UndefOr[String] = js.native;
	val linejoin: js.UndefOr[String] = js.native;

@js.native
@JSGlobal("THREE.LineBasicMaterial")
class LineBasicMaterial extends Material:
	def this(parameters: js.UndefOr[LineBasicMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val linewidth: Double = js.native;
	val linecap: String = js.native;
	val linejoin: String = js.native;
	def setValues(parameters: LineBasicMaterialParameters): Unit = js.native

@js.native
sealed trait PointsMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val size: js.UndefOr[Double] = js.native;
	val sizeAttenuation: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.PointsMaterial")
class PointsMaterial extends Material:
	def this(parameters: js.UndefOr[PointsMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val map: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val size: Double = js.native;
	val sizeAttenuation: Boolean = js.native;
	def setValues(parameters: PointsMaterialParameters): Unit = js.native

@js.native
sealed trait MeshPhongMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val specular: js.UndefOr[ColorRepresentation] = js.native;
	val shininess: js.UndefOr[Double] = js.native;
	val opacity: js.UndefOr[Double] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val lightMap: js.UndefOr[Texture | Null] = js.native;
	val lightMapIntensity: js.UndefOr[Double] = js.native;
	val aoMap: js.UndefOr[Texture | Null] = js.native;
	val aoMapIntensity: js.UndefOr[Double] = js.native;
	val emissive: js.UndefOr[ColorRepresentation] = js.native;
	val emissiveIntensity: js.UndefOr[Double] = js.native;
	val emissiveMap: js.UndefOr[Texture | Null] = js.native;
	val bumpMap: js.UndefOr[Texture | Null] = js.native;
	val bumpScale: js.UndefOr[Double] = js.native;
	val normalMap: js.UndefOr[Texture | Null] = js.native;
	val normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	val normalScale: js.UndefOr[Vector2] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val specularMap: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val envMap: js.UndefOr[Texture | Null] = js.native;
	val combine: js.UndefOr[Combine] = js.native;
	val reflectivity: js.UndefOr[Double] = js.native;
	val refractionRatio: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val wireframeLinecap: js.UndefOr[String] = js.native;
	val wireframeLinejoin: js.UndefOr[String] = js.native;
	val flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshPhongMaterial")
class MeshPhongMaterial extends Material:
	def this(parameters: js.UndefOr[MeshPhongMaterialParameters]) = this()
	val `type`: String = js.native;
	val color: Color = js.native;
	val specular: Color = js.native;
	val shininess: Double = js.native;
	val map: Texture | Null = js.native;
	val lightMap: Texture | Null = js.native;
	val lightMapIntensity: Double = js.native;
	val aoMap: Texture | Null = js.native;
	val aoMapIntensity: Double = js.native;
	val emissive: Color = js.native;
	val emissiveIntensity: Double = js.native;
	val emissiveMap: Texture | Null = js.native;
	val bumpMap: Texture | Null = js.native;
	val bumpScale: Double = js.native;
	val normalMap: Texture | Null = js.native;
	val normalMapType: NormalMapTypes = js.native;
	val normalScale: Vector2 = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val specularMap: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val envMap: Texture | Null = js.native;
	val combine: Combine = js.native;
	val reflectivity: Double = js.native;
	val refractionRatio: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val wireframeLinecap: String = js.native;
	val wireframeLinejoin: String = js.native;
	val flatShading: Boolean = js.native;
	val metal: Boolean = js.native;
	def setValues(parameters: MeshPhongMaterialParameters): Unit = js.native

@js.native
sealed trait MeshStandardMaterialParameters extends MaterialParameters:
	val color: js.UndefOr[ColorRepresentation] = js.native;
	val roughness: js.UndefOr[Double] = js.native;
	val metalness: js.UndefOr[Double] = js.native;
	val map: js.UndefOr[Texture | Null] = js.native;
	val lightMap: js.UndefOr[Texture | Null] = js.native;
	val lightMapIntensity: js.UndefOr[Double] = js.native;
	val aoMap: js.UndefOr[Texture | Null] = js.native;
	val aoMapIntensity: js.UndefOr[Double] = js.native;
	val emissive: js.UndefOr[ColorRepresentation] = js.native;
	val emissiveIntensity: js.UndefOr[Double] = js.native;
	val emissiveMap: js.UndefOr[Texture | Null] = js.native;
	val bumpMap: js.UndefOr[Texture | Null] = js.native;
	val bumpScale: js.UndefOr[Double] = js.native;
	val normalMap: js.UndefOr[Texture | Null] = js.native;
	val normalMapType: js.UndefOr[NormalMapTypes] = js.native;
	val normalScale: js.UndefOr[Vector2] = js.native;
	val displacementMap: js.UndefOr[Texture | Null] = js.native;
	val displacementScale: js.UndefOr[Double] = js.native;
	val displacementBias: js.UndefOr[Double] = js.native;
	val roughnessMap: js.UndefOr[Texture | Null] = js.native;
	val metalnessMap: js.UndefOr[Texture | Null] = js.native;
	val alphaMap: js.UndefOr[Texture | Null] = js.native;
	val envMap: js.UndefOr[Texture | Null] = js.native;
	val envMapIntensity: js.UndefOr[Double] = js.native;
	val refractionRatio: js.UndefOr[Double] = js.native;
	val wireframe: js.UndefOr[Boolean] = js.native;
	val wireframeLinewidth: js.UndefOr[Double] = js.native;
	val flatShading: js.UndefOr[Boolean] = js.native;

@js.native
@JSGlobal("THREE.MeshStandardMaterial")
class MeshStandardMaterial extends Material:
	def this(parameters: js.UndefOr[MeshStandardMaterialParameters]) = this()
	val `type`: String = js.native;
	val defines: objectType33 = js.native;
	val color: Color = js.native;
	val roughness: Double = js.native;
	val metalness: Double = js.native;
	val map: Texture | Null = js.native;
	val lightMap: Texture | Null = js.native;
	val lightMapIntensity: Double = js.native;
	val aoMap: Texture | Null = js.native;
	val aoMapIntensity: Double = js.native;
	val emissive: Color = js.native;
	val emissiveIntensity: Double = js.native;
	val emissiveMap: Texture | Null = js.native;
	val bumpMap: Texture | Null = js.native;
	val bumpScale: Double = js.native;
	val normalMap: Texture | Null = js.native;
	val normalMapType: NormalMapTypes = js.native;
	val normalScale: Vector2 = js.native;
	val displacementMap: Texture | Null = js.native;
	val displacementScale: Double = js.native;
	val displacementBias: Double = js.native;
	val roughnessMap: Texture | Null = js.native;
	val metalnessMap: Texture | Null = js.native;
	val alphaMap: Texture | Null = js.native;
	val envMap: Texture | Null = js.native;
	val envMapIntensity: Double = js.native;
	val refractionRatio: Double = js.native;
	val wireframe: Boolean = js.native;
	val wireframeLinewidth: Double = js.native;
	val wireframeLinecap: String = js.native;
	val wireframeLinejoin: String = js.native;
	val flatShading: Boolean = js.native;
	val isMeshStandardMaterial: Boolean = js.native;
	def setValues(parameters: MeshStandardMaterialParameters): Unit = js.native

@js.native
sealed trait objectType35 extends js.Object:
	val derivatives: js.UndefOr[Boolean] = js.native;
	val fragDepth: js.UndefOr[Boolean] = js.native;
	val drawBuffers: js.UndefOr[Boolean] = js.native;
	val shaderTextureLOD: js.UndefOr[Boolean] = js.native;

@js.native
sealed trait objectType34 extends js.Object:
	@JSBracketAccess
	def apply(uniform: String): IUniform[js.Any] = js.native

@js.native
sealed trait objectType33 extends js.Object:
	@JSBracketAccess
	def apply(key: String): js.Any = js.native

@js.native
sealed trait objectType36 extends js.Object:
	val derivatives: Boolean = js.native;
	val fragDepth: Boolean = js.native;
	val drawBuffers: Boolean = js.native;
	val shaderTextureLOD: Boolean = js.native;
