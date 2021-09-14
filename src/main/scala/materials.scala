package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object materials extends js.Object:
	@js.nativetrait MeshMatcapMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val matcap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val normalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val normalMapType: js.UndefOr[js.UndefOr[NormalMapTypes]] = js.native;
		val normalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val flatShading: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class MeshMatcapMaterial extends js.Object:
		val type: String = js.native;
		val defines: objectType22 = js.native;
		val color: Color = js.native;
		val matcap: Texture | null = js.native;
		val map: Texture | null = js.native;
		val bumpMap: Texture | null = js.native;
		val bumpScale: Double = js.native;
		val normalMap: Texture | null = js.native;
		val normalMapType: NormalMapTypes = js.native;
		val normalScale: Vector2 = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val alphaMap: Texture | null = js.native;
		val flatShading: Boolean = js.native;
		def setValues(parameters: MeshMatcapMaterialParameters): Unit = js.native
	@js.nativetrait LineDashedMaterialParameters extends LineBasicMaterialParameters:
		val scale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val dashSize: js.UndefOr[js.UndefOr[Double]] = js.native;
		val gapSize: js.UndefOr[js.UndefOr[Double]] = js.native;
	@js.native
	class LineDashedMaterial extends js.Object:
		val type: String = js.native;
		val scale: Double = js.native;
		val dashSize: Double = js.native;
		val gapSize: Double = js.native;
		var isLineDashedMaterial: true = js.native;
		def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
	@js.nativetrait MeshToonMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val opacity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val gradientMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val aoMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val aoMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissive: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val emissiveIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissiveMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val normalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val normalMapType: js.UndefOr[js.UndefOr[NormalMapTypes]] = js.native;
		val normalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframeLinecap: js.UndefOr[js.UndefOr[String]] = js.native;
		val wireframeLinejoin: js.UndefOr[js.UndefOr[String]] = js.native;
	@js.native
	class MeshToonMaterial extends js.Object:
		val type: String = js.native;
		val defines: objectType22 = js.native;
		val color: Color = js.native;
		val gradientMap: Texture | null = js.native;
		val map: Texture | null = js.native;
		val lightMap: Texture | null = js.native;
		val lightMapIntensity: Double = js.native;
		val aoMap: Texture | null = js.native;
		val aoMapIntensity: Double = js.native;
		val emissive: Color = js.native;
		val emissiveIntensity: Double = js.native;
		val emissiveMap: Texture | null = js.native;
		val bumpMap: Texture | null = js.native;
		val bumpScale: Double = js.native;
		val normalMap: Texture | null = js.native;
		val normalMapType: NormalMapTypes = js.native;
		val normalScale: Vector2 = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val alphaMap: Texture | null = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val wireframeLinecap: String = js.native;
		val wireframeLinejoin: String = js.native;
		def setValues(parameters: MeshToonMaterialParameters): Unit = js.native
	@js.nativetrait MeshDepthMaterialParameters extends MaterialParameters:
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val depthPacking: js.UndefOr[js.UndefOr[DepthPackingStrategies]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
	@js.native
	class MeshDepthMaterial extends js.Object:
		val type: String = js.native;
		val map: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val depthPacking: DepthPackingStrategies = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val fog: Boolean = js.native;
		def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
	@js.native
	class RawShaderMaterial extends js.Object:
	@js.nativetrait MeshDistanceMaterialParameters extends MaterialParameters:
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val farDistance: js.UndefOr[js.UndefOr[Double]] = js.native;
		val nearDistance: js.UndefOr[js.UndefOr[Double]] = js.native;
		val referencePosition: js.UndefOr[js.UndefOr[Vector3]] = js.native;
	@js.native
	class MeshDistanceMaterial extends js.Object:
		val type: String = js.native;
		val map: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val farDistance: Double = js.native;
		val nearDistance: Double = js.native;
		val referencePosition: Vector3 = js.native;
		val fog: Boolean = js.native;
		def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
	@js.nativetrait MaterialParameters extends js.Object:
		val alphaTest: js.UndefOr[js.UndefOr[Double]] = js.native;
		val alphaToCoverage: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val blendDst: js.UndefOr[js.UndefOr[BlendingDstFactor]] = js.native;
		val blendDstAlpha: js.UndefOr[js.UndefOr[Double]] = js.native;
		val blendEquation: js.UndefOr[js.UndefOr[BlendingEquation]] = js.native;
		val blendEquationAlpha: js.UndefOr[js.UndefOr[Double]] = js.native;
		val blending: js.UndefOr[js.UndefOr[Blending]] = js.native;
		val blendSrc: js.UndefOr[js.UndefOr[BlendingSrcFactorBlendingDstFactor]] = js.native;
		val blendSrcAlpha: js.UndefOr[js.UndefOr[Double]] = js.native;
		val clipIntersection: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val clippingPlanes: js.UndefOr[js.UndefOr[js.Array[Plane]]] = js.native;
		val clipShadows: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val colorWrite: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val defines: js.UndefOr[js.Any] = js.native;
		val depthFunc: js.UndefOr[js.UndefOr[DepthModes]] = js.native;
		val depthTest: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val depthWrite: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val fog: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val name: js.UndefOr[js.UndefOr[String]] = js.native;
		val opacity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val polygonOffset: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val polygonOffsetFactor: js.UndefOr[js.UndefOr[Double]] = js.native;
		val polygonOffsetUnits: js.UndefOr[js.UndefOr[Double]] = js.native;
		val precision: js.UndefOr[js.UndefOr["highp""mediump""lowp"null]] = js.native;
		val premultipliedAlpha: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val dithering: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val side: js.UndefOr[js.UndefOr[Side]] = js.native;
		val shadowSide: js.UndefOr[js.UndefOr[Side]] = js.native;
		val toneMapped: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val transparent: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val vertexColors: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val visible: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val stencilWrite: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val stencilFunc: js.UndefOr[js.UndefOr[StencilFunc]] = js.native;
		val stencilRef: js.UndefOr[js.UndefOr[Double]] = js.native;
		val stencilWriteMask: js.UndefOr[js.UndefOr[Double]] = js.native;
		val stencilFuncMask: js.UndefOr[js.UndefOr[Double]] = js.native;
		val stencilFail: js.UndefOr[js.UndefOr[StencilOp]] = js.native;
		val stencilZFail: js.UndefOr[js.UndefOr[StencilOp]] = js.native;
		val stencilZPass: js.UndefOr[js.UndefOr[StencilOp]] = js.native;
		val userData: js.UndefOr[js.Any] = js.native;
	@js.native
	class Material extends js.Object:
		val alphaTest: Double = js.native;
		val alphaToCoverage: Boolean = js.native;
		val blendDst: BlendingDstFactor = js.native;
		val blendDstAlpha: Double | null = js.native;
		val blendEquation: BlendingEquation = js.native;
		val blendEquationAlpha: Double | null = js.native;
		val blending: Blending = js.native;
		val blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native;
		val blendSrcAlpha: Double | null = js.native;
		val clipIntersection: Boolean = js.native;
		val clippingPlanes: js.Any = js.native;
		val clipShadows: Boolean = js.native;
		val colorWrite: Boolean = js.native;
		val defines: js.UndefOr[objectType22] = js.native;
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
		var isMaterial: true = js.native;
		val name: String = js.native;
		val needsUpdate: Boolean = js.native;
		val opacity: Double = js.native;
		val polygonOffset: Boolean = js.native;
		val polygonOffsetFactor: Double = js.native;
		val polygonOffsetUnits: Double = js.native;
		val precision: "highp" | "mediump" | "lowp" | null = js.native;
		val premultipliedAlpha: Boolean = js.native;
		val dithering: Boolean = js.native;
		val side: Side = js.native;
		val shadowSide: Side = js.native;
		val toneMapped: Boolean = js.native;
		val transparent: Boolean = js.native;
		val type: String = js.native;
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
		def toJSON(meta: js.UndefOr[js.Any] = js.undefined): js.Any = js.native
	@js.nativetrait ShadowMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
	@js.native
	class ShadowMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val transparent: Boolean = js.native;
	@js.nativetrait ShaderMaterialParameters extends MaterialParameters:
		val uniforms: js.UndefOr[js.UndefOr[objectType23]] = js.native;
		val vertexShader: js.UndefOr[js.UndefOr[String]] = js.native;
		val fragmentShader: js.UndefOr[js.UndefOr[String]] = js.native;
		val linewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val lights: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val clipping: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val extensions: js.UndefOr[js.UndefOr[objectType24]] = js.native;
		val glslVersion: js.UndefOr[js.UndefOr[GLSLVersion]] = js.native;
	@js.native
	class ShaderMaterial extends js.Object:
		val type: String = js.native;
		val defines: objectType22 = js.native;
		val uniforms: objectType23 = js.native;
		val vertexShader: String = js.native;
		val fragmentShader: String = js.native;
		val linewidth: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val fog: Boolean = js.native;
		val lights: Boolean = js.native;
		val clipping: Boolean = js.native;
		val derivatives: js.Any = js.native;
		val extensions: objectType25 = js.native;
		val defaultAttributeValues: js.Any = js.native;
		val index0AttributeName: js.UndefOr[String] = js.native;
		val uniformsNeedUpdate: Boolean = js.native;
		val glslVersion: GLSLVersion | null = js.native;
		val isShaderMaterial: Boolean = js.native;
		def setValues(parameters: ShaderMaterialParameters): Unit = js.native
		def toJSON(meta: js.Any): js.Any = js.native
	@js.nativetrait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters:
		val clearcoat: js.UndefOr[js.UndefOr[Double]] = js.native;
		val clearcoatMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val clearcoatRoughness: js.UndefOr[js.UndefOr[Double]] = js.native;
		val clearcoatRoughnessMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val clearcoatNormalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val clearcoatNormalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val reflectivity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val ior: js.UndefOr[js.UndefOr[Double]] = js.native;
		val sheen: js.UndefOr[js.UndefOr[Color]] = js.native;
		val transmission: js.UndefOr[js.UndefOr[Double]] = js.native;
		val transmissionMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val attenuationDistance: js.UndefOr[js.UndefOr[Double]] = js.native;
		val attenuationTint: js.UndefOr[js.UndefOr[Color]] = js.native;
		val specularIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val specularTint: js.UndefOr[js.UndefOr[Color]] = js.native;
		val specularIntensityMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val specularTintMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
	@js.native
	class MeshPhysicalMaterial extends js.Object:
		val type: String = js.native;
		val defines: objectType22 = js.native;
		val clearcoat: Double = js.native;
		val clearcoatMap: Texture | null = js.native;
		val clearcoatRoughness: Double = js.native;
		val clearcoatRoughnessMap: Texture | null = js.native;
		val clearcoatNormalScale: Vector2 = js.native;
		val clearcoatNormalMap: Texture | null = js.native;
		val reflectivity: Double = js.native;
		val ior: Double = js.native;
		val sheen: Color | null = js.native;
		val transmission: Double = js.native;
		val transmissionMap: Texture | null = js.native;
		val thickness: Double = js.native;
		val thicknessMap: Texture | null = js.native;
		val attenuationDistance: Double = js.native;
		val attenuationColor: Color = js.native;
		val specularIntensity: Double = js.native;
		val specularTint: Color = js.native;
		val specularIntensityMap: Texture | null = js.native;
		val specularTintMap: Texture | null = js.native;
	@js.nativetrait MeshLambertMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val emissive: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val emissiveIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissiveMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val aoMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val aoMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val specularMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val envMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val combine: js.UndefOr[js.UndefOr[Combine]] = js.native;
		val reflectivity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val refractionRatio: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframeLinecap: js.UndefOr[js.UndefOr[String]] = js.native;
		val wireframeLinejoin: js.UndefOr[js.UndefOr[String]] = js.native;
	@js.native
	class MeshLambertMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val emissive: Color = js.native;
		val emissiveIntensity: Double = js.native;
		val emissiveMap: Texture | null = js.native;
		val map: Texture | null = js.native;
		val lightMap: Texture | null = js.native;
		val lightMapIntensity: Double = js.native;
		val aoMap: Texture | null = js.native;
		val aoMapIntensity: Double = js.native;
		val specularMap: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val envMap: Texture | null = js.native;
		val combine: Combine = js.native;
		val reflectivity: Double = js.native;
		val refractionRatio: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val wireframeLinecap: String = js.native;
		val wireframeLinejoin: String = js.native;
		def setValues(parameters: MeshLambertMaterialParameters): Unit = js.native
	@js.nativetrait SpriteMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val rotation: js.UndefOr[js.UndefOr[Double]] = js.native;
		val sizeAttenuation: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class SpriteMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val map: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val rotation: Double = js.native;
		val sizeAttenuation: Boolean = js.native;
		val transparent: Boolean = js.native;
		var isSpriteMaterial: true = js.native;
		def setValues(parameters: SpriteMaterialParameters): Unit = js.native
		def copy(source: SpriteMaterial): this.type = js.native
	@js.nativetrait MeshBasicMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val opacity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMap: js.UndefOr[Texture | null] = js.native;
		val lightMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val aoMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val aoMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val specularMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val envMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val combine: js.UndefOr[js.UndefOr[Combine]] = js.native;
		val reflectivity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val refractionRatio: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframeLinecap: js.UndefOr[js.UndefOr[String]] = js.native;
		val wireframeLinejoin: js.UndefOr[js.UndefOr[String]] = js.native;
	@js.native
	class MeshBasicMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val map: Texture | null = js.native;
		val lightMap: Texture | null = js.native;
		val lightMapIntensity: Double = js.native;
		val aoMap: Texture | null = js.native;
		val aoMapIntensity: Double = js.native;
		val specularMap: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val envMap: Texture | null = js.native;
		val combine: Combine = js.native;
		val reflectivity: Double = js.native;
		val refractionRatio: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val wireframeLinecap: String = js.native;
		val wireframeLinejoin: String = js.native;
		def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native
	@js.nativetrait MeshNormalMaterialParameters extends MaterialParameters:
		val bumpMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val normalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val normalMapType: js.UndefOr[js.UndefOr[NormalMapTypes]] = js.native;
		val normalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val flatShading: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class MeshNormalMaterial extends js.Object:
		val type: String = js.native;
		val bumpMap: Texture | null = js.native;
		val bumpScale: Double = js.native;
		val normalMap: Texture | null = js.native;
		val normalMapType: NormalMapTypes = js.native;
		val normalScale: Vector2 = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val flatShading: Boolean = js.native;
		def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native
	@js.nativetrait LineBasicMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val linewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val linecap: js.UndefOr[js.UndefOr[String]] = js.native;
		val linejoin: js.UndefOr[js.UndefOr[String]] = js.native;
	@js.native
	class LineBasicMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val linewidth: Double = js.native;
		val linecap: String = js.native;
		val linejoin: String = js.native;
		def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
	@js.nativetrait PointsMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val size: js.UndefOr[js.UndefOr[Double]] = js.native;
		val sizeAttenuation: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class PointsMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val map: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val size: Double = js.native;
		val sizeAttenuation: Boolean = js.native;
		def setValues(parameters: PointsMaterialParameters): Unit = js.native
	@js.nativetrait MeshPhongMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val specular: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val shininess: js.UndefOr[js.UndefOr[Double]] = js.native;
		val opacity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val aoMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val aoMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissive: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val emissiveIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissiveMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val normalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val normalMapType: js.UndefOr[js.UndefOr[NormalMapTypes]] = js.native;
		val normalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val specularMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val envMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val combine: js.UndefOr[js.UndefOr[Combine]] = js.native;
		val reflectivity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val refractionRatio: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframeLinecap: js.UndefOr[js.UndefOr[String]] = js.native;
		val wireframeLinejoin: js.UndefOr[js.UndefOr[String]] = js.native;
		val flatShading: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class MeshPhongMaterial extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val specular: Color = js.native;
		val shininess: Double = js.native;
		val map: Texture | null = js.native;
		val lightMap: Texture | null = js.native;
		val lightMapIntensity: Double = js.native;
		val aoMap: Texture | null = js.native;
		val aoMapIntensity: Double = js.native;
		val emissive: Color = js.native;
		val emissiveIntensity: Double = js.native;
		val emissiveMap: Texture | null = js.native;
		val bumpMap: Texture | null = js.native;
		val bumpScale: Double = js.native;
		val normalMap: Texture | null = js.native;
		val normalMapType: NormalMapTypes = js.native;
		val normalScale: Vector2 = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val specularMap: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val envMap: Texture | null = js.native;
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
	@js.nativetrait MeshStandardMaterialParameters extends MaterialParameters:
		val color: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val roughness: js.UndefOr[js.UndefOr[Double]] = js.native;
		val metalness: js.UndefOr[js.UndefOr[Double]] = js.native;
		val map: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val lightMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val aoMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val aoMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissive: js.UndefOr[js.UndefOr[ColorRepresentation]] = js.native;
		val emissiveIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val emissiveMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val bumpScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val normalMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val normalMapType: js.UndefOr[js.UndefOr[NormalMapTypes]] = js.native;
		val normalScale: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val displacementMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val displacementScale: js.UndefOr[js.UndefOr[Double]] = js.native;
		val displacementBias: js.UndefOr[js.UndefOr[Double]] = js.native;
		val roughnessMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val metalnessMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val alphaMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val envMap: js.UndefOr[js.UndefOr[Texturenull]] = js.native;
		val envMapIntensity: js.UndefOr[js.UndefOr[Double]] = js.native;
		val refractionRatio: js.UndefOr[js.UndefOr[Double]] = js.native;
		val wireframe: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val wireframeLinewidth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val flatShading: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.native
	class MeshStandardMaterial extends js.Object:
		val type: String = js.native;
		val defines: objectType22 = js.native;
		val color: Color = js.native;
		val roughness: Double = js.native;
		val metalness: Double = js.native;
		val map: Texture | null = js.native;
		val lightMap: Texture | null = js.native;
		val lightMapIntensity: Double = js.native;
		val aoMap: Texture | null = js.native;
		val aoMapIntensity: Double = js.native;
		val emissive: Color = js.native;
		val emissiveIntensity: Double = js.native;
		val emissiveMap: Texture | null = js.native;
		val bumpMap: Texture | null = js.native;
		val bumpScale: Double = js.native;
		val normalMap: Texture | null = js.native;
		val normalMapType: NormalMapTypes = js.native;
		val normalScale: Vector2 = js.native;
		val displacementMap: Texture | null = js.native;
		val displacementScale: Double = js.native;
		val displacementBias: Double = js.native;
		val roughnessMap: Texture | null = js.native;
		val metalnessMap: Texture | null = js.native;
		val alphaMap: Texture | null = js.native;
		val envMap: Texture | null = js.native;
		val envMapIntensity: Double = js.native;
		val refractionRatio: Double = js.native;
		val wireframe: Boolean = js.native;
		val wireframeLinewidth: Double = js.native;
		val wireframeLinecap: String = js.native;
		val wireframeLinejoin: String = js.native;
		val flatShading: Boolean = js.native;
		val isMeshStandardMaterial: Boolean = js.native;
		def setValues(parameters: MeshStandardMaterialParameters): Unit = js.native
