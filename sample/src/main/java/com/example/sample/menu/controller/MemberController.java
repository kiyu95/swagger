package com.example.sample.menu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
@Tag(name = "Member", description = "Member API")
public class MemberController {

    @Operation(summary = "멤버 조회", description = "모든 멤버를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "SUCCESS", content = @Content(schema = @Schema(implementation = MemberList.class))),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")
    })
    @GetMapping("/vi/info")
    public ResponseEntity findMember(@Parameter){
    }
}
