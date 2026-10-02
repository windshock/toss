// entry=0x585b8

void H585b8(code *param_1)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  char *unaff_x23;
  
  (*param_1)();
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  do {
    cVar1 = *unaff_x23;
    unaff_x23 = unaff_x23 + 1;
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0015bcdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285e90)
            ((&DAT_0029e620)
             [(long)(int)((uVar2 ^ 0xf97b14d4) + (uVar2 & 0xf97b14d4) * 2) * 0x2b +
              (long)(int)((uVar3 | 0xf97b14ec) + (uVar3 & 0xf97b14ec))]);
  return;
}


