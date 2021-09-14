package typings.three.three.renderers.shaders

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
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
sealed trait Shader extends js.Object:
	val uniforms: objectType41 = js.native;
	val vertexShader: String = js.native;
	val fragmentShader: String = js.native;
val ShaderLib: objectType42 = js.native;
val ShaderChunk: objectType43 = js.native;
def cloneUniforms(uniforms_src: js.Any): js.Any = js.native
def mergeUniforms(uniforms: js.Array[js.Any]): js.Any = js.native

@js.native
@JSGlobal("THREE.UniformsUtils")
object UniformsUtils extends js.Object

@js.native
sealed trait IUniform[TValue] extends js.Object:
	val value: TValue = js.native;
val UniformsLib: objectType44 = js.native;

@js.native
sealed trait objectType41 extends js.Object:
	@JSBracketAccess
	def apply(uniform: String): IUniform[js.Any] = js.native

@js.native
sealed trait objectType42 extends js.Object:
	val basic: Shader = js.native;
	val lambert: Shader = js.native;
	val phong: Shader = js.native;
	val standard: Shader = js.native;
	val matcap: Shader = js.native;
	val points: Shader = js.native;
	val dashed: Shader = js.native;
	val depth: Shader = js.native;
	val normal: Shader = js.native;
	val sprite: Shader = js.native;
	val background: Shader = js.native;
	val cube: Shader = js.native;
	val equirect: Shader = js.native;
	val distanceRGBA: Shader = js.native;
	val shadow: Shader = js.native;
	val physical: Shader = js.native;
	@JSBracketAccess
	def apply(name: String): Shader = js.native

@js.native
sealed trait objectType44 extends js.Object:
	val common: objectType45 = js.native;
	val specularmap: objectType46 = js.native;
	val envmap: objectType47 = js.native;
	val aomap: objectType48 = js.native;
	val lightmap: objectType49 = js.native;
	val emissivemap: objectType50 = js.native;
	val bumpmap: objectType51 = js.native;
	val normalmap: objectType52 = js.native;
	val displacementmap: objectType53 = js.native;
	val roughnessmap: objectType54 = js.native;
	val metalnessmap: objectType55 = js.native;
	val gradientmap: objectType56 = js.native;
	val fog: objectType57 = js.native;
	val lights: objectType58 = js.native;
	val points: objectType59 = js.native;

@js.native
sealed trait objectType40 extends js.Object:
	val enabled: Boolean = js.native;

@js.native
sealed trait objectType43 extends js.Object:
	val alphamap_fragment: String = js.native;
	val alphamap_pars_fragment: String = js.native;
	val alphatest_fragment: String = js.native;
	val aomap_fragment: String = js.native;
	val aomap_pars_fragment: String = js.native;
	val begin_vertex: String = js.native;
	val beginnormal_vertex: String = js.native;
	val bsdfs: String = js.native;
	val bumpmap_pars_fragment: String = js.native;
	val clipping_planes_fragment: String = js.native;
	val clipping_planes_pars_fragment: String = js.native;
	val clipping_planes_pars_vertex: String = js.native;
	val clipping_planes_vertex: String = js.native;
	val color_fragment: String = js.native;
	val color_pars_fragment: String = js.native;
	val color_pars_vertex: String = js.native;
	val color_vertex: String = js.native;
	val common: String = js.native;
	val cube_frag: String = js.native;
	val cube_vert: String = js.native;
	val cube_uv_reflection_fragment: String = js.native;
	val defaultnormal_vertex: String = js.native;
	val depth_frag: String = js.native;
	val depth_vert: String = js.native;
	val distanceRGBA_frag: String = js.native;
	val distanceRGBA_vert: String = js.native;
	val displacementmap_vertex: String = js.native;
	val displacementmap_pars_vertex: String = js.native;
	val emissivemap_fragment: String = js.native;
	val emissivemap_pars_fragment: String = js.native;
	val encodings_pars_fragment: String = js.native;
	val encodings_fragment: String = js.native;
	val envmap_fragment: String = js.native;
	val envmap_common_pars_fragment: String = js.native;
	val envmap_pars_fragment: String = js.native;
	val envmap_pars_vertex: String = js.native;
	val envmap_vertex: String = js.native;
	val equirect_frag: String = js.native;
	val equirect_vert: String = js.native;
	val fog_fragment: String = js.native;
	val fog_pars_fragment: String = js.native;
	val linedashed_frag: String = js.native;
	val linedashed_vert: String = js.native;
	val lightmap_fragment: String = js.native;
	val lightmap_pars_fragment: String = js.native;
	val lights_lambert_vertex: String = js.native;
	val lights_pars_begin: String = js.native;
	val envmap_physical_pars_fragment: String = js.native;
	val lights_pars_map: String = js.native;
	val lights_phong_fragment: String = js.native;
	val lights_phong_pars_fragment: String = js.native;
	val lights_physical_fragment: String = js.native;
	val lights_physical_pars_fragment: String = js.native;
	val lights_fragment_begin: String = js.native;
	val lights_fragment_maps: String = js.native;
	val lights_fragment_end: String = js.native;
	val logdepthbuf_fragment: String = js.native;
	val logdepthbuf_pars_fragment: String = js.native;
	val logdepthbuf_pars_vertex: String = js.native;
	val logdepthbuf_vertex: String = js.native;
	val map_fragment: String = js.native;
	val map_pars_fragment: String = js.native;
	val map_particle_fragment: String = js.native;
	val map_particle_pars_fragment: String = js.native;
	val meshbasic_frag: String = js.native;
	val meshbasic_vert: String = js.native;
	val meshlambert_frag: String = js.native;
	val meshlambert_vert: String = js.native;
	val meshphong_frag: String = js.native;
	val meshphong_vert: String = js.native;
	val meshphysical_frag: String = js.native;
	val meshphysical_vert: String = js.native;
	val metalnessmap_fragment: String = js.native;
	val metalnessmap_pars_fragment: String = js.native;
	val morphnormal_vertex: String = js.native;
	val morphtarget_pars_vertex: String = js.native;
	val morphtarget_vertex: String = js.native;
	val normal_flip: String = js.native;
	val normal_frag: String = js.native;
	val normal_fragment_begin: String = js.native;
	val normal_fragment_maps: String = js.native;
	val normal_vert: String = js.native;
	val normalmap_pars_fragment: String = js.native;
	val clearcoat_normal_fragment_begin: String = js.native;
	val clearcoat_normal_fragment_maps: String = js.native;
	val clearcoat_pars_fragment: String = js.native;
	val packing: String = js.native;
	val points_frag: String = js.native;
	val points_vert: String = js.native;
	val shadow_frag: String = js.native;
	val shadow_vert: String = js.native;
	val premultiplied_alpha_fragment: String = js.native;
	val project_vertex: String = js.native;
	val roughnessmap_fragment: String = js.native;
	val roughnessmap_pars_fragment: String = js.native;
	val shadowmap_pars_fragment: String = js.native;
	val shadowmap_pars_vertex: String = js.native;
	val shadowmap_vertex: String = js.native;
	val shadowmask_pars_fragment: String = js.native;
	val skinbase_vertex: String = js.native;
	val skinning_pars_vertex: String = js.native;
	val skinning_vertex: String = js.native;
	val skinnormal_vertex: String = js.native;
	val specularmap_fragment: String = js.native;
	val specularmap_pars_fragment: String = js.native;
	val tonemapping_fragment: String = js.native;
	val tonemapping_pars_fragment: String = js.native;
	val uv2_pars_fragment: String = js.native;
	val uv2_pars_vertex: String = js.native;
	val uv2_vertex: String = js.native;
	val uv_pars_fragment: String = js.native;
	val uv_pars_vertex: String = js.native;
	val uv_vertex: String = js.native;
	val worldpos_vertex: String = js.native;
	@JSBracketAccess
	def apply(name: String): String = js.native
